package peopleGroup;

import random.AverageRandom;

/**
 * Created by yangzhang on 2017/4/18.
 */
public class PeopleGroup {
    final int BASE_POPULATION_GROW   = 10;
    final int BASE_TOWN_HELTHY       = 100;
    final int BASE_DEFEND_LEVEL      =10;

    private int m_famerNum;
    private int m_soldierNum;
    private int m_growNum;

    private int m_defendLevel;
    private int m_TownHelthy;

    private int m_fieldFamerNum;
    private int m_buildingFamerNum;

    private int m_robSoldierNum;
    private int m_defendSoldierNum;
    private int m_attackSoldierNum;

    private AverageRandom m_random = new AverageRandom();

    private PeopleGroup m_enemy = null;


    public PeopleGroup(){
        m_famerNum          = 10;
        m_soldierNum        = 10;
        m_growNum           = BASE_POPULATION_GROW;
        m_defendLevel      = BASE_DEFEND_LEVEL;
        m_TownHelthy       = BASE_TOWN_HELTHY;

        m_fieldFamerNum    = 0;
        m_buildingFamerNum = 0;

        m_robSoldierNum    =0;
        m_defendSoldierNum =0;
        m_attackSoldierNum =0;
    }

    public void setEnemy (PeopleGroup enemy){
        m_enemy = enemy;
    }

    public void oneRound(){
        assignNewPeople();
        assignWork();
        work();
    }

    private void work() {
        m_growNum = BASE_POPULATION_GROW + m_fieldFamerNum;
        m_defendLevel = m_defendLevel + m_buildingFamerNum;
    }

    private void assignNewPeople() {
        m_famerNum       += m_growNum/2;
        m_soldierNum += m_growNum - m_growNum/2;
    }

    private void assignWork() {
        m_fieldFamerNum    = m_famerNum/2;
        m_buildingFamerNum = m_famerNum - m_famerNum/2;

        m_robSoldierNum    = m_soldierNum/3;
        m_defendSoldierNum = m_soldierNum/3;
        m_attackSoldierNum = m_soldierNum - m_robSoldierNum - m_defendSoldierNum;
    }

    public void show(){
        System.out.println("m_famerNum: " + m_famerNum);
        System.out.println("m_soldierNum: " + m_soldierNum);
        System.out.println("m_growNum: " + m_growNum);
        System.out.println("m_defendLevel: " + m_defendLevel);
        System.out.println("m_TownHelthy: " + m_TownHelthy);

        System.out.println("m_fieldFamerNum: " + m_fieldFamerNum);
        System.out.println("m_buildingFamerNum: " + m_buildingFamerNum);
        System.out.println("m_robSoldierNum: " + m_robSoldierNum);
        System.out.println("m_defendSoldierNum: " + m_defendSoldierNum);
        System.out.println("m_attackSoldierNum: " + m_attackSoldierNum);

    }
    class Addd {

    }
}

