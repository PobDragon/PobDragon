/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.example.spinner;

import java.util.ArrayList;
import java.util.List;

import com.android.example.spinner.R;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

/**
 * Displays an Android spinner widget backed by data in an array. The array is
 * loaded from the strings.xml resources file.
 */
@TargetApi(11)
public class SpinnerActivity extends Activity {

    Spinner spinner1;
    Spinner spinner2;
    List<String> listSpinner2;
    TextView tvMain;
    TextView tvPrereq;
    ArrayAdapter<String> dataAdapterSt2;
    // arrays:
    ArrayList listAttackSpinner = new ArrayList() ;
    ArrayList listDefenceSpinner = new ArrayList() ;
    ArrayList listGoAfterTheEnemySpinner = new ArrayList() ;
    ArrayList listPullBackSpinner = new ArrayList() ;
    ArrayList listOutOfCombatSpinner = new ArrayList() ;
    ArrayList listUnusualEventsSpinner = new ArrayList() ;
    ArrayList listRallyBattalionSpinner = new ArrayList() ;
    
    /**
     * Fields to contain the current position and display contents of the
     * spinner
     */
    protected int mPos;
    protected String mSelection;
    /**
     * ArrayAdapter connects the spinner widget to array-based data.
     */
    protected ArrayAdapter<CharSequence> mAdapter;
    /**
     * The initial position of the spinner when it is first installed.
     */
    public static final int DEFAULT_POSITION = 2;
    /**
     * The name of a properties file that stores the position and selection when
     * the activity is not loaded.
     */
    public static final String PREFERENCES_FILE = "SpinnerPrefs";
    /**
     * These values are used to read and write the properties file.
     * PROPERTY_DELIMITER delimits the key and value in a Java properties file.
     * The "marker" strings are used to write the properties into the file
     */
    public static final String PROPERTY_DELIMITER = "=";
    /**
     * The key or label for "position" in the preferences file
     */
    public static final String POSITION_KEY = "Position";
    /**
     * The key or label for "selection" in the preferences file
     */
    public static final String SELECTION_KEY = "Selection";
    public static final String POSITION_MARKER =
            POSITION_KEY + PROPERTY_DELIMITER;
    public static final String SELECTION_MARKER =
            SELECTION_KEY + PROPERTY_DELIMITER;

    /**
     * Initializes the application and the activity. 1) Sets the view 2) Reads
     * the spinner's backing data from the string resources file 3) Instantiates
     * a callback listener for handling selection from the spinner Notice that
     * this method includes code that can be uncommented to force tests to fail.
     *
     * This method overrides the default onCreate() method for an Activity.
     *
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        /**
         * derived classes that use onCreate() overrides must always call the
         * super constructor
         */
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
        
        // initialise the array strings:
        //
        // See spreadsheet "Generating_listSpinner_Arrays.ods"
        //
        // Offensive Maneuvers
        listAttackSpinner.add("A0 - Select an Offensive Maneuver") ;
        listAttackSpinner.add("A1 - Assault vs. Position") ;
        listAttackSpinner.add("A2 - Attack") ;
        listAttackSpinner.add("A3 - Attack vs. Two") ;
        listAttackSpinner.add("A4 - Attack with Another") ;
        listAttackSpinner.add("A5 - Assault vs. Position") ;
        listAttackSpinner.add("A6 - Charge") ;
        listAttackSpinner.add("A7 - Move on Flank") ;
        listAttackSpinner.add("A8 - Push Deeper") ;
        listAttackSpinner.add("A9 - Run Down Sprinter") ;
        // Defensive Maneuvers 
        listDefenceSpinner.add("D0 - Select a Defensive Maneuver") ;
        listDefenceSpinner.add("D1 - Stand Fast ") ;
        listDefenceSpinner.add("D2 - Stand vs. Charge ") ;
        listDefenceSpinner.add("D3 - Stand vs. Two ") ;
        listDefenceSpinner.add("D4 - Stand with Another ") ;
        listDefenceSpinner.add("D5 - Dropped Rock ") ;
        listDefenceSpinner.add("D6 - Reargaurd ") ;
        // Go After the Enemy 
        listGoAfterTheEnemySpinner.add("G0 - Select Go After The Enemy choice") ;
        listGoAfterTheEnemySpinner.add("G1 - Stop") ;
        listGoAfterTheEnemySpinner.add("G2 - Follow") ;
        listGoAfterTheEnemySpinner.add("G3 - Pursue ") ;
        listGoAfterTheEnemySpinner.add("G4 - Chase ") ;
        // Pull Back 
        listPullBackSpinner.add("P0 - Select Pull Back event") ;
        listPullBackSpinner.add("P1 - Run Away! ") ;
        listPullBackSpinner.add("P2 - Sprint ") ;
        listPullBackSpinner.add("P3 - Withdraw ") ;
        listPullBackSpinner.add("P4 - Flee Fighting ") ;
        listPullBackSpinner.add("P5 - Seeking a Special Unit ") ;
        // Out of Combat 
        listOutOfCombatSpinner.add("O0 - Select Out of Combat event") ;
        listOutOfCombatSpinner.add("O1 - Advance ") ;
        listOutOfCombatSpinner.add("O2 - Remain Disengaged ") ;
        listOutOfCombatSpinner.add("O3 - Remove (Self) ") ;
        // Unusual Events 
        listUnusualEventsSpinner.add("U0 - Select Unusual Event") ;
        listUnusualEventsSpinner.add("U1 - Opportunity ") ;
        listUnusualEventsSpinner.add("U2 - Surprise ") ;
        // Rally Battalion 
        listRallyBattalionSpinner.add("R0 - Select Rally Battalion") ;
        listRallyBattalionSpinner.add("R1 - Reserves ") ;
        listRallyBattalionSpinner.add("R2 - Bonus & Penalty") ;


        Spinner spinner1 = (Spinner) findViewById(R.id.Spinner01);

        /*
         * Create a backing mLocalAdapter for the Spinner from a list of the
         * planets. The list is defined by XML in the strings.xml file.
         */
        this.mAdapter = ArrayAdapter.createFromResource(this, R.array.Manouvres,
                android.R.layout.simple_spinner_dropdown_item);

        /*
         * Attach the mLocalAdapter to the spinner.
         */
        spinner1.setAdapter(this.mAdapter);

        /*
         * Create a listener that is triggered when Android detects the user has
         * selected an item in the Spinner.
         */
        OnItemSelectedListener spinnerListener = new myOnItemSelectedListener(this, this.mAdapter);

        /*
         * Attach the listener to the Spinner.
         */
        spinner1.setOnItemSelectedListener(spinnerListener);

        spinner2 = (Spinner) findViewById(R.id.Spinner02);
        listSpinner2 = new ArrayList<String>();
        //
        dataAdapterSt2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listSpinner2);
        dataAdapterSt2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapterSt2);
        //
        OnItemSelectedListener spinner2Listener = new myOnItemSelectedListener(this, this.mAdapter);
        spinner2.setOnItemSelectedListener(spinner2Listener);

    }

    /**
     * A callback listener that implements the
     *  {@link android.widget.AdapterView.OnItemSelectedListener} interface For
     * views based on adapters, this interface defines the methods available
     * when the user selects an item from the View.
     *
     */
    public class myOnItemSelectedListener implements OnItemSelectedListener {

        /*
         * provide local instances of the mLocalAdapter and the mLocalContext
         */
        ArrayAdapter<CharSequence> mLocalAdapter;
        Activity mLocalContext;

        /**
         * Constructor
         *
         * @param c - The activity that displays the Spinner.
         * @param ad - The Adapter view that controls the Spinner. Instantiate a
         * new listener object.
         */
        public myOnItemSelectedListener(Activity c, ArrayAdapter<CharSequence> ad) {

            this.mLocalContext = c;
            this.mLocalAdapter = ad;

        }

        /**
         * When the user selects an item in the spinner, this method is invoked
         * by the callback chain. Android calls the item selected listener for
         * the spinner, which invokes the onItemSelected method.
         *
         * @see
         * android.widget.AdapterView.OnItemSelectedListener#onItemSelected(
         * android.widget.AdapterView, android.view.View, int, long)
         * @param parent - the AdapterView for this listener
         * @param v - the View for this listener
         * @param pos - the 0-based position of the selection in the
         * mLocalAdapter
         * @param row - the 0-based row number of the selection in the View
         */
        public void onItemSelected(AdapterView<?> parent, View v, int pos, long row) {

            SpinnerActivity.this.mPos = pos;
            SpinnerActivity.this.mSelection = parent.getItemAtPosition(pos).toString();
            
            /*
             * Set the value of the text field in the UI
             */

            if (SpinnerActivity.this.mSelection.equalsIgnoreCase("Attack")) {
                dataAdapterSt2.clear();
                for (int i = 0; i < listAttackSpinner.size(); i++) {
                    dataAdapterSt2.add((String)listAttackSpinner.get(i));
                }
            }
            if (SpinnerActivity.this.mSelection.equalsIgnoreCase("Defence")) {
                dataAdapterSt2.clear();
                for (int i = 0; i < listDefenceSpinner.size(); i++) {
                    dataAdapterSt2.add((String)listDefenceSpinner.get(i));
                }
            } 
            if (SpinnerActivity.this.mSelection.equalsIgnoreCase("Go After the Enemy")) {
                dataAdapterSt2.clear();
                for (int i = 0; i < listGoAfterTheEnemySpinner.size(); i++) {
                    dataAdapterSt2.add((String)listGoAfterTheEnemySpinner.get(i));
                }
            } 
            if (SpinnerActivity.this.mSelection.equalsIgnoreCase("Pull Back")) {
                dataAdapterSt2.clear();
                for (int i = 0; i < listPullBackSpinner.size(); i++) {
                    dataAdapterSt2.add((String)listPullBackSpinner.get(i));
                }
            } 
            if (SpinnerActivity.this.mSelection.equalsIgnoreCase("Out of Combat")) {
                dataAdapterSt2.clear();
                for (int i = 0; i < listOutOfCombatSpinner.size(); i++) {
                    dataAdapterSt2.add((String)listOutOfCombatSpinner.get(i));
                }
            } 
            if (SpinnerActivity.this.mSelection.equalsIgnoreCase("Unusual Events")) {
                dataAdapterSt2.clear();
                for (int i = 0; i < listUnusualEventsSpinner.size(); i++) {
                    dataAdapterSt2.add((String)listUnusualEventsSpinner.get(i));
                }
            } 
            if (SpinnerActivity.this.mSelection.equalsIgnoreCase("Rally Battalion")) {
                dataAdapterSt2.clear();
                for (int i = 0; i < listRallyBattalionSpinner.size(); i++) {
                    dataAdapterSt2.add((String)listRallyBattalionSpinner.get(i));
                }
            } 
//            else {
//                dataAdapterSt2.clear();
//                dataAdapterSt2.add("Nothing found1");
//            }//
            
            dataAdapterSt2.notifyDataSetChanged() ;
            
            tvMain = (TextView) findViewById(R.id.tvTextMain);;
            tvPrereq = (TextView) findViewById(R.id.tvTextPrereq);;

            tvMain.setText("Nothing Selected.");
            tvPrereq.setText("No Prerequisites.");

            SpinnerActivity.this.setSpinnerPosition(0);

            String spinnerString = SpinnerActivity.this.getSpinnerSelection();
            // tvMain.setText(spinnerString) ;

            String switchText = spinnerString;
            if (switchText.regionMatches(0, "A1", 0, 2)) {
                tvMain.setText("This should contain \n A1 punch");
            }
            else if (switchText.regionMatches(0, "A2", 0, 2)) {
                tvMain.setText("This should contain \n A2 kick");
            }
            else if (switchText.regionMatches(0, "A3", 0, 2)) {
                tvMain.setText("This should contain \n A3 bite");
            }
            //
            else if (switchText.regionMatches(0, "D1", 0, 2)) {
                tvMain.setText("This should contain \n D1 block");
            }
            else if (switchText.regionMatches(0, "D2", 0, 2)) {
                tvMain.setText("This should contain \n D2 hide");
            }
            else if (switchText.regionMatches(0, "D3", 0, 2)) {
                tvMain.setText("This should contain \n D3 run away!!!");
            }
            //
            else if (switchText.regionMatches(0, "G1", 0, 2)) {
                tvMain.setText("This should contain \n G1 Go after the enemy");
            }
            //
            else if (switchText.regionMatches(0, "P1", 0, 2)) {
                tvMain.setText("This should contain \n P1 Pull Back");
            }
            //
            else if (switchText.regionMatches(0, "O1", 0, 2)) {
                tvMain.setText("This should contain \n O1 Out of Combat");
            }
            //
            else if (switchText.regionMatches(0, "U1", 0, 2)) {
                tvMain.setText("This should contain \n U1 Unusual Events");
            }
            //
            else if (switchText.regionMatches(0, "R1", 0, 2)) {
                tvMain.setText("This should contain \n R1 Rally the Battalion!");
                tvPrereq.setText("You need a Battalion! (test prereq text)");
            }
            //
            
        
//        listGoAfterTheEnemySpinner.add("G1 - TBC");
//        listPullBackSpinner.add("P1 - TBC");
//        listOutOfCombatSpinner.add("O1 - TBC");
//        listUnusualEventsSpinner.add("U1 - TBC");
//        listRallyBattalionSpinner.add("R1 - TBC") ;


        }

        /**
         * The definition of OnItemSelectedListener requires an override of
         * onNothingSelected(), even though this implementation does not use it.
         *
         * @param parent - The View for this Listener
         */
        public void onNothingSelected(AdapterView<?> parent) {
            // do nothing
        }
    }

    /**
     * Restores the current state of the spinner (which item is selected, and
     * the value of that item). Since onResume() is always called when an
     * Activity is starting, even if it is re-displaying after being hidden, it
     * is the best place to restore state.
     *
     * Attempts to read the state from a preferences file. If this read fails,
     * assume it was just installed, so do an initialization. Regardless, change
     * the state of the spinner to be the previous position.
     *
     * @see android.app.Activity#onResume()
     */
    @Override
    public void onResume() {

        /*
         * an override to onResume() must call the super constructor first.
         */

        super.onResume();

        /*
         * Try to read the preferences file. If not found, set the state to the
         * desired initial values.
         */

        if (!readInstanceState(this)) {
            setInitialState();
        }

        /*
         * Set the spinner to the current state.
         */

        Spinner restoreSpinner = (Spinner) findViewById(R.id.Spinner01);
        restoreSpinner.setSelection(getSpinnerPosition());

        Spinner restoreSpinner2 = (Spinner) findViewById(R.id.Spinner02);
        restoreSpinner2.setSelection(getSpinnerPosition());

    }

    /**
     * Store the current state of the spinner (which item is selected, and the
     * value of that item). Since onPause() is always called when an Activity is
     * about to be hidden, even if it is about to be destroyed, it is the best
     * place to save state.
     *
     * Attempt to write the state to the preferences file. If this fails, notify
     * the user.
     *
     * @see android.app.Activity#onPause()
     */
    @Override
    public void onPause() {

        /*
         * an override to onPause() must call the super constructor first.
         */

        super.onPause();

        /*
         * Save the state to the preferences file. If it fails, display a Toast,
         * noting the failure.
         */

        if (!writeInstanceState(this)) {
            Toast.makeText(this,
                    "Failed to write state!", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Sets the initial state of the spinner when the application is first run.
     */
    public void setInitialState() {

        this.mPos = DEFAULT_POSITION;

    }

    /**
     * Read the previous state of the spinner from the preferences file
     *
     * @param c - The Activity's Context
     */
    public boolean readInstanceState(Context c) {

        /*
         * The preferences are stored in a SharedPreferences file. The abstract
         * implementation of SharedPreferences is a "file" containing a hashmap.
         * All instances of an application share the same instance of this file,
         * which means that all instances of an application share the same
         * preference settings.
         */

        /*
         * Get the SharedPreferences object for this application
         */

        SharedPreferences p = c.getSharedPreferences(PREFERENCES_FILE, MODE_WORLD_READABLE);
        /*
         * Get the position and value of the spinner from the file, or a default
         * value if the key-value pair does not exist.
         */
        this.mPos = p.getInt(POSITION_KEY, SpinnerActivity.DEFAULT_POSITION);
        this.mSelection = p.getString(SELECTION_KEY, "");

        /*
         * SharedPreferences doesn't fail if the code tries to get a
         * non-existent key. The most straightforward way to indicate success is
         * to return the results of a test that SharedPreferences contained the
         * position key.
         */

        return (p.contains(POSITION_KEY));

    }

    /**
     * Write the application's current state to a properties repository.
     *
     * @param c - The Activity's Context
     *
     */
    public boolean writeInstanceState(Context c) {

        /*
         * Get the SharedPreferences object for this application
         */

        SharedPreferences p =
                c.getSharedPreferences(SpinnerActivity.PREFERENCES_FILE, MODE_WORLD_READABLE);

        /*
         * Get the editor for this object. The editor interface abstracts the
         * implementation of updating the SharedPreferences object.
         */

        SharedPreferences.Editor e = p.edit();

        /*
         * Write the keys and values to the Editor
         */

        e.putInt(POSITION_KEY, this.mPos);
        e.putString(SELECTION_KEY, this.mSelection);

        /*
         * Commit the changes. Return the result of the commit. The commit fails
         * if Android failed to commit the changes to persistent storage.
         */

        return (e.commit());

    }

    public int getSpinnerPosition() {
        return this.mPos;
    }

    public void setSpinnerPosition(int pos) {
        this.mPos = pos;
    }

    public String getSpinnerSelection() {
        return this.mSelection;
    }

    public void setSpinnerSelection(String selection) {
        this.mSelection = selection;
    }
}
