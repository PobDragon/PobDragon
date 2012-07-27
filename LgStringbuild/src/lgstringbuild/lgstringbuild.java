/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lgstringbuild;

import pobData.putStrings;

import java.util.HashMap;
import java.util.Map;
import pobData.pobData;

/**
 *
 * @author djm
 */
public class lgstringbuild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap2D testH2 = new HashMap2D();
        testH2.addElement("A1", "B2", "C3");
        String outH2 = testH2.getElement("A1", "B2");
        System.out.println("2D = " + outH2);

        HashMap3D testH3 = new HashMap3D();
        testH3.addElement3D("A1", "B2", "C3", "D4");
        String outH3 = testH3.getElement3D("A1", "B2", "C3");
        System.out.println("3D = " + outH3);

        System.out.println("testing the default loading characteristics");
        System.out.println((String) testH3.getElement3D("Test1", "Test2", "Test3"));

        System.out.println("");



// start here:					

// Offensive					
// Maneuver					
        testH3.addElement3D("Offensive", "Assault vs. Position", "Prerequisite", "Position is nearby");
        testH3.addElement3D("Offensive", "Assault vs. Position", "Opponent", "Unit(s) in position");
        testH3.addElement3D("Offensive", "Assault vs. Position", "Triumph", "-2 Intensity; Move forward 1 Zone; Special! (pg. 25)");
        testH3.addElement3D("Offensive", "Assault vs. Position", "Win", "Enemy holds! Normal");
        testH3.addElement3D("Offensive", "Assault vs. Position", "Loss", "Enemy holds! Recoil 1 Zone");
        testH3.addElement3D("Offensive", "Assault vs. Position", "Crush", " +2 Intensity; Recoil 1 Zone");
        testH3.addElement3D("Offensive", "Attack", "Prerequisite", "None");
        testH3.addElement3D("Offensive", "Attack", "Opponent", "3 random foes; player choose 1");
        testH3.addElement3D("Offensive", "Attack", "Triumph", "-2 Intensity");
        testH3.addElement3D("Offensive", "Attack", "Win", "Normal");
        testH3.addElement3D("Offensive", "Attack", "Loss", "Normal");
        testH3.addElement3D("Offensive", "Attack", "Crush", "+2 Intensity");
        testH3.addElement3D("Offensive", "Attack vs. Two", "Prerequisite", "None");
        testH3.addElement3D("Offensive", "Attack vs. Two", "Opponent", "3 random foes; player choose 1; GM choose 1");
        testH3.addElement3D("Offensive", "Attack vs. Two", "Triumph", "-3 Intensity");
        testH3.addElement3D("Offensive", "Attack vs. Two", "Win", "Normal");
        testH3.addElement3D("Offensive", "Attack vs. Two", "Loss", "Recoil 1 Zone         ");
        testH3.addElement3D("Offensive", "Attack vs. Two", "Crush", "+2 Intensity; Recoil 1 Zone");
        testH3.addElement3D("Offensive", "Attack w/ Another", "Prerequisite", "None");
        testH3.addElement3D("Offensive", "Attack w/ Another", "Opponent", "3 random foes; player choose 1; Enemy ×0.5");
        testH3.addElement3D("Offensive", "Attack w/ Another", "Triumph", "-1 Intensity");
        testH3.addElement3D("Offensive", "Attack w/ Another", "Win", "Normal");
        testH3.addElement3D("Offensive", "Attack w/ Another", "Loss", "Normal");
        testH3.addElement3D("Offensive", "Attack w/ Another", "Crush", "+2 Intensity; Recoil 1 Zone");
        testH3.addElement3D("Offensive", "Charge", "Prerequisite", "Disengaged");
        testH3.addElement3D("Offensive", "Charge", "Opponent", "1 random foe");
        testH3.addElement3D("Offensive", "Charge", "Triumph", "-2 Intensity; Move forward 2 Zones");
        testH3.addElement3D("Offensive", "Charge", "Win", "-1 Intensity; Move forward 1 Zone");
        testH3.addElement3D("Offensive", "Charge", "Loss", "Move forward 1 Zone");
        testH3.addElement3D("Offensive", "Charge", "Crush", "+2 Intensity; Move Forward 1 Zone; Disordered");
        testH3.addElement3D("Offensive", "Move on Flank", "Prerequisite", "None");
        testH3.addElement3D("Offensive", "Move on Flank", "Opponent", "1d6-2 foes");
        testH3.addElement3D("Offensive", "Move on Flank", "Triumph", "-1 Intensity; on flank or charge next");
        testH3.addElement3D("Offensive", "Move on Flank", "Win", "Normal; on shielded flank");
        testH3.addElement3D("Offensive", "Move on Flank", "Loss", "Normal");
        testH3.addElement3D("Offensive", "Move on Flank", "Crush", "+2 Intensity; Disordered");
        testH3.addElement3D("Offensive", "Push Deeper", "Prerequisite", "None");
        testH3.addElement3D("Offensive", "Push Deeper", "Opponent", "3 random foes; GM choose 1");
        testH3.addElement3D("Offensive", "Push Deeper", "Triumph", "-2 Intensity; Move forward 1 Zone");
        testH3.addElement3D("Offensive", "Push Deeper", "Win", "Move forward 1 Zone");
        testH3.addElement3D("Offensive", "Push Deeper", "Loss", "Normal; Disordered");
        testH3.addElement3D("Offensive", "Push Deeper", "Crush", "+2 Intensity; Disordered");
        testH3.addElement3D("Offensive", "Run Down Sprinter", "Prerequisite", "Enemy Unit is Sprinting");
        testH3.addElement3D("Offensive", "Run Down Sprinter", "Opponent", "The Sprinting Unit");
        testH3.addElement3D("Offensive", "Run Down Sprinter", "Triumph", "Move forward 2 Zones, Disordered; Check Reckless");
        testH3.addElement3D("Offensive", "Run Down Sprinter", "Win", "Move forward 1 Zone");
        testH3.addElement3D("Offensive", "Run Down Sprinter", "Loss", "Move forward 1 Zone; Disordered");
        testH3.addElement3D("Offensive", "Run Down Sprinter", "Crush", "+4 Intensity, Recoil 1 Zone; Check Cowardly");



// Defensive					
// Maneuver					
        testH3.addElement3D("Defensive", "Stand Fast", "Prerequisite", "Unit was Attacked");
        testH3.addElement3D("Defensive", "Stand Fast", "Opponent", "3 random foes; GM choose 1");
        testH3.addElement3D("Defensive", "Stand Fast", "Triumph", "-2 Intensity");
        testH3.addElement3D("Defensive", "Stand Fast", "Win", "Normal");
        testH3.addElement3D("Defensive", "Stand Fast", "Loss", "Move back 1 Zone");
        testH3.addElement3D("Defensive", "Stand Fast", "Crush", "+2 Intensity; Recoil 1 Zone");
        testH3.addElement3D("Defensive", "Stand vs. Charge", "Prerequisite", "Unit was Charged (i.e. Unit Commander Fumbles)");
        testH3.addElement3D("Defensive", "Stand vs. Charge", "Opponent", "3 random mounted foes; GM choose 1");
        testH3.addElement3D("Defensive", "Stand vs. Charge", "Triumph", "-3 Intensity");
        testH3.addElement3D("Defensive", "Stand vs. Charge", "Win", "Normal");
        testH3.addElement3D("Defensive", "Stand vs. Charge", "Loss", "Recoil 1 Zone");
        testH3.addElement3D("Defensive", "Stand vs. Charge", "Crush", "+2 Intensity; Recoil 2 Zones; Broken");
        testH3.addElement3D("Defensive", "Stand vs. Two", "Prerequisite", "Unit was Attacked by multiple foes (i.e. GM Criticals)");
        testH3.addElement3D("Defensive", "Stand vs. Two", "Opponent", "3 random mounted foes, GM choose 2");
        testH3.addElement3D("Defensive", "Stand vs. Two", "Triumph", "-2 Intensity");
        testH3.addElement3D("Defensive", "Stand vs. Two", "Win", "Normal");
        testH3.addElement3D("Defensive", "Stand vs. Two", "Loss", "Recoil 1 Zone");
        testH3.addElement3D("Defensive", "Stand vs. Two", "Crush", "+2 Intensity; Recoil 1 Zone");
        testH3.addElement3D("Defensive", "Stand w/ Another", "Prerequisite", "None");
        testH3.addElement3D("Defensive", "Stand w/ Another", "Opponent", "3 random foes, GM choose 2; enemy ×0.5");
        testH3.addElement3D("Defensive", "Stand w/ Another", "Triumph", "-1 Intensity");
        testH3.addElement3D("Defensive", "Stand w/ Another", "Win", "Normal");
        testH3.addElement3D("Defensive", "Stand w/ Another", "Loss", "Disordered");
        testH3.addElement3D("Defensive", "Stand w/ Another", "Crush", "+2 Intensity; Recoil 1 Zone");



// Go After the Enemy					
// Maneuver					
        testH3.addElement3D("Go After the Enemy", "Stop", "Prerequisite", "Enemy Army Pulls Away");
        testH3.addElement3D("Go After the Enemy", "Stop", "Opponent", "None");
        testH3.addElement3D("Go After the Enemy", "Stop", "Triumph", "Disengaged. Out of the Battle");
        testH3.addElement3D("Go After the Enemy", "Stop", "Win", "Disengaged. Out of the Battle");
        testH3.addElement3D("Go After the Enemy", "Stop", "Loss", "Disengaged. Out of the Battle");
        testH3.addElement3D("Go After the Enemy", "Stop", "Crush", "Disengaged. Out of the Battle");
        testH3.addElement3D("Go After the Enemy", "Follow", "Prerequisite", "Enemy Army Withdrawing");
        testH3.addElement3D("Go After the Enemy", "Follow", "Opponent", "1 random foe; +10 bonus to foe");
        testH3.addElement3D("Go After the Enemy", "Follow", "Triumph", "-2 Intensity; Move forward 2 Zones");
        testH3.addElement3D("Go After the Enemy", "Follow", "Win", "Move forward 1 Zone");
        testH3.addElement3D("Go After the Enemy", "Follow", "Loss", "Move forward 1 Zone");
        testH3.addElement3D("Go After the Enemy", "Follow", "Crush", "+2 Intensity; No movement; Disengaged");
        testH3.addElement3D("Go After the Enemy", "Pursue", "Prerequisite", "Enemy Army Retreating");
        testH3.addElement3D("Go After the Enemy", "Pursue", "Opponent", "2 foes, each ×0.5; Rearguard 18-20");
        testH3.addElement3D("Go After the Enemy", "Pursue", "Triumph", "-2 Intensity; Move forward 2 Zones; Disordered");
        testH3.addElement3D("Go After the Enemy", "Pursue", "Win", "Move forward 2 Zones; Broken");
        testH3.addElement3D("Go After the Enemy", "Pursue", "Loss", "Move forward 1 Zone; Disengaged");
        testH3.addElement3D("Go After the Enemy", "Pursue", "Crush", "+2 Intensity; Recoil 1 Zone; Disengaged");
        testH3.addElement3D("Go After the Enemy", "Chase (Individuals use Hunting)", "Prerequisite", "Enemy Army Routing; Unit will Break");
        testH3.addElement3D("Go After the Enemy", "Chase (Individuals use Hunting)", "Opponent", "1d6 foes, Each ×0.5; Rearguard 20");
        testH3.addElement3D("Go After the Enemy", "Chase (Individuals use Hunting)", "Triumph", "Not applicable. All knights are Alone.");
        testH3.addElement3D("Go After the Enemy", "Chase (Individuals use Hunting)", "Win", "Not applicable. All knights are Alone.");
        testH3.addElement3D("Go After the Enemy", "Chase (Individuals use Hunting)", "Loss", "Not applicable. All knights are Alone.");
        testH3.addElement3D("Go After the Enemy", "Chase (Individuals use Hunting)", "Crush", "Not applicable. All knights are Alone.");



// Pull Back					
// Maneuver					
        testH3.addElement3D("Pull Back", "Run Away! (Horsemanship)", "Prerequisite", "None");
        testH3.addElement3D("Pull Back", "Run Away! (Horsemanship)", "Opponent", "3 random foes, player choose 1");
        testH3.addElement3D("Pull Back", "Run Away! (Horsemanship)", "Triumph", "Move back 1 or 2 Zones; Disengaged");
        testH3.addElement3D("Pull Back", "Run Away! (Horsemanship)", "Win", "Move back 1 Zone; Disordered & Disengaged");
        testH3.addElement3D("Pull Back", "Run Away! (Horsemanship)", "Loss", "Recoil 1 Zone; Disordered & Disengaged");
        testH3.addElement3D("Pull Back", "Run Away! (Horsemanship)", "Crush", "+2 Intensity; Broken");
        testH3.addElement3D("Pull Back", "Sprint", "Prerequisite", "Marked w/ “Sprint” as a Skill");
        testH3.addElement3D("Pull Back", "Sprint", "Opponent", "Any attacking Non-missile Opponent +5 to attack");
        testH3.addElement3D("Pull Back", "Sprint", "Triumph", "Move back 2 Zones; Disordered");
        testH3.addElement3D("Pull Back", "Sprint", "Win", "Move back 1 Zone; Disordered");
        testH3.addElement3D("Pull Back", "Sprint", "Loss", "Broken");
        testH3.addElement3D("Pull Back", "Sprint", "Crush", "Broken");
        testH3.addElement3D("Pull Back", "Withdraw (+10 bonus)", "Prerequisite", "None");
        testH3.addElement3D("Pull Back", "Withdraw (+10 bonus)", "Opponent", "3 random foes, Gamemaster choose 1");
        testH3.addElement3D("Pull Back", "Withdraw (+10 bonus)", "Triumph", "Move back 1 Zone; Disengaged; -2 Intensity");
        testH3.addElement3D("Pull Back", "Withdraw (+10 bonus)", "Win", "Move Back 1 Zone; Disengaged");
        testH3.addElement3D("Pull Back", "Withdraw (+10 bonus)", "Loss", "Move back 1 Zone");
        testH3.addElement3D("Pull Back", "Withdraw (+10 bonus)", "Crush", "+2 Intensity; Recoil 1 Zone");
        testH3.addElement3D("Pull Back", "Flee Fighting", "Prerequisite", "Shoot n’ Scoot");
        testH3.addElement3D("Pull Back", "Flee Fighting", "Opponent", "Any non-missile horse unit that attacks");
        testH3.addElement3D("Pull Back", "Flee Fighting", "Triumph", "Move Back 1 Zone; Disengaged");
        testH3.addElement3D("Pull Back", "Flee Fighting", "Win", "Move Back 1 Zone; Disengaged");
        testH3.addElement3D("Pull Back", "Flee Fighting", "Loss", "Move Back 1 Zone; Disordered & Disengaged");
        testH3.addElement3D("Pull Back", "Flee Fighting", "Crush", "+1 Intensity Move Back 2 Zones; Broken");



// Out of Combat					
// Maneuver					
        testH3.addElement3D("Out of Combat", "Advance", "Prerequisite", "Unit is in a Noncombat Zone");
        testH3.addElement3D("Out of Combat", "Advance", "Opponent", "No foes, no fight, move up to 2 Zones forward; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Advance", "Triumph", "No foes, no fight, move up to 2 Zones forward; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Advance", "Win", "No foes, no fight, move up to 2 Zones forward; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Advance", "Loss", "No foes, no fight, move up to 2 Zones forward; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Advance", "Crush", "No foes, no fight, move up to 2 Zones forward; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Remain Disengaged", "Prerequisite", "Unit is Disengaged");
        testH3.addElement3D("Out of Combat", "Remain Disengaged", "Opponent", "No foes, no fight, no move; perform a Disengaged action; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Remain Disengaged", "Triumph", "No foes, no fight, no move; perform a Disengaged action; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Remain Disengaged", "Win", "No foes, no fight, no move; perform a Disengaged action; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Remain Disengaged", "Loss", "No foes, no fight, no move; perform a Disengaged action; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Remain Disengaged", "Crush", "No foes, no fight, no move; perform a Disengaged action; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Remove (Self)", "Prerequisite", "Unit is in a Noncombat Zone or Disengaged");
        testH3.addElement3D("Out of Combat", "Remove (Self)", "Opponent", "No foes, no fight, move 1 or 2 Zones back; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Remove (Self)", "Triumph", "No foes, no fight, move 1 or 2 Zones back; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Remove (Self)", "Win", "No foes, no fight, move 1 or 2 Zones back; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Remove (Self)", "Loss", "No foes, no fight, move 1 or 2 Zones back; Disengaged on next round.");
        testH3.addElement3D("Out of Combat", "Remove (Self)", "Crush", "No foes, no fight, move 1 or 2 Zones back; Disengaged on next round.");



// Unusual Events					
// Maneuver					
        testH3.addElement3D("Unusual Events", "Opportunity", "Prerequisite", "The unit commander must have won, and rolled a critical success");
        testH3.addElement3D("Unusual Events", "Opportunity", "Opponent", "See Table in Book of Battle p38");
        testH3.addElement3D("Unusual Events", "Opportunity", "Triumph", "See p38");
        testH3.addElement3D("Unusual Events", "Opportunity", "Win", "See p38");
        testH3.addElement3D("Unusual Events", "Opportunity", "Loss", "See p38");
        testH3.addElement3D("Unusual Events", "Opportunity", "Crush", "See p38");
        testH3.addElement3D("Unusual Events", "Surprise", "Prerequisite", "This occurs every time that the Unit Commander and Intensity both get a Critical Success or both Fumble on the unit maneuver roll.");
        testH3.addElement3D("Unusual Events", "Surprise", "Opponent", "See Table in Book of Battle p39");
        testH3.addElement3D("Unusual Events", "Surprise", "Triumph", "See p39");
        testH3.addElement3D("Unusual Events", "Surprise", "Win", "See p39");
        testH3.addElement3D("Unusual Events", "Surprise", "Loss", "See p39");
        testH3.addElement3D("Unusual Events", "Surprise", "Crush", "See p39");



// Rally Battalion					
// Maneuver					
        testH3.addElement3D("Rally Battalion", "Rally Battalion", "Prerequisite", "Intensity greater than 30");
        testH3.addElement3D("Rally Battalion", "Rally Battalion", "Opponent", "×3 random melee; 1 missile");
        testH3.addElement3D("Rally Battalion", "Rally Battalion", "Triumph", "-20 Intensity");
        testH3.addElement3D("Rally Battalion", "Rally Battalion", "Win", "-10 Intensity");
        testH3.addElement3D("Rally Battalion", "Rally Battalion", "Loss", "Recoil 2 Zones");
        testH3.addElement3D("Rally Battalion", "Rally Battalion", "Crush", "+2 Intensity; Broken");









//        data.getStrings(data, null, null, null);
//        String strOut = data.getStrings(data,"Attack","AssVP","Triumph") ;
//        System.out.println(strOut);
    }
}
