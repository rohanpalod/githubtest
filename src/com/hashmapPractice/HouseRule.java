package com.hashmapPractice;

import jdk.nashorn.internal.ir.SetSplitState;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Rule{
    Boolean isApplicable;
    HashMap<String,Boolean> configuration;
    Rule(Boolean isApplicable){
        this.isApplicable = isApplicable ;
        this.configuration=new HashMap<String, Boolean>();
    }

    @Override
    public String toString() {
        return "Rule{" +
                "isApplicable=" + isApplicable +
                ", configuration=" + configuration +
                '}';
    }
}

class HouseRule {
    String creator;
    HashMap<String, Rule> houseRuleMap;
    HouseRule(String creator) {
        this.houseRuleMap = new HashMap<String, Rule>();
        this.creator = creator;
    }
}
class Main {
    public static void main(String[] args) {
        HouseRule hr1 = new HouseRule("Batlu");

        Rule hr1WatchTvRule = new Rule(true);
        hr1WatchTvRule.configuration.put("Morning", false);
        hr1WatchTvRule.configuration.put("Afternoon", true);
        hr1WatchTvRule.configuration.put("Evening", false);
//        for(Map.Entry m : hr1WatchTvRule.configuration.entrySet()){
//            System.out.println(m.getKey()+":"+m.getValue());
//        }
        Rule hr1EatFoodRule = new Rule(true);
        hr1EatFoodRule.configuration.put("Morning",false);
        hr1EatFoodRule.configuration.put("Afternoon",true);
        hr1EatFoodRule.configuration.put("Evening",true);
        Rule hr1TakeBathRule = new Rule(false);
        hr1.houseRuleMap.put("WatchTV",hr1WatchTvRule);
        hr1.houseRuleMap.put("EatFood",hr1EatFoodRule);
        hr1.houseRuleMap.put("TakeBath",hr1TakeBathRule);
//        for(Map.Entry m : hr1.houseRuleMap.entrySet()){
//            System.out.println(m.getKey()+":"+m.getValue());
//        }
        HouseRule hr2 = new HouseRule("Reshu");
        Rule hr2WatchTvRule= new Rule(true);
        hr2WatchTvRule.configuration.put("Morning",false);
        hr2WatchTvRule.configuration.put("Afternoon",true);
        hr2WatchTvRule.configuration.put("Evening",true);
        Rule hr2EatFoodRule = new Rule(true);
        hr2EatFoodRule.configuration.put("Morning",true);
        hr2EatFoodRule.configuration.put("Afternoon",true);
        hr2EatFoodRule.configuration.put("Evening",true);
        Rule hr2TakeBathRule = new Rule(true);
        hr2TakeBathRule.configuration.put("Morning",true);
        hr2TakeBathRule.configuration.put("Afternoon",false);
        hr2TakeBathRule.configuration.put("Evening",false);
        hr2.houseRuleMap.put("WatchTV",hr2WatchTvRule);
        hr2.houseRuleMap.put("EatFood",hr2EatFoodRule);
        hr2.houseRuleMap.put("TakeBath",hr2EatFoodRule);
        Set<Map.Entry<String,Rule>> myset = hr2.houseRuleMap.entrySet();
        for(Map.Entry m1 : myset){
            System.out.println(m1.getKey()+":"+m1.getValue());
        }

        Main.getResultedRule(hr1.houseRuleMap,hr2.houseRuleMap);
    }
    public static HashMap<String,Rule> getResultedRule(HashMap<String,Rule> rule1,HashMap<String,Rule> rule2){
        Set<String> allKeys=rule1.keySet();
        HashMap<String,Rule> toReturn = new HashMap<String, Rule>();
        for(String key : allKeys){
            System.out.println(key);
            Rule r1=rule1.get(key);
            Rule r2=rule2.get(key);
            if(r1.isApplicable==true && r2.isApplicable==false){
                toReturn.put(key,r2);
            }
            else if(r1.isApplicable==false && r2.isApplicable==true){
                toReturn.put(key,r2);
            }
            else if(r1.isApplicable==true && r2.isApplicable==true){
                toReturn.put(key,r2);
            }
            else if(r1.isApplicable==false && r2.isApplicable==false){
                toReturn.put(key,r2);
            }
        }
        for(Map.Entry m2 : toReturn.entrySet()){
            System.out.println(m2.getKey()+":"+m2.getValue());
        }
        return toReturn;
    }
}