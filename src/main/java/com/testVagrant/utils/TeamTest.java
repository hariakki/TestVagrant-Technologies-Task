package com.testVagrant.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.testVagrant.pojo.PlayerDetails;
import com.testVagrant.pojo.RCBTeam;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.sql.SQLOutput;
import java.util.List;

public class TeamTest {

    public int validateForeignPlayer(List<PlayerDetails> players) {
        int foreignPlayer = 0;
        for (PlayerDetails playerDet : players) {

            if (!playerDet.getCountry().equals("India")) {
                foreignPlayer++;

            }

        }
        return foreignPlayer;
    }


    public int wicketKeepSize(List<PlayerDetails> players){
        int wicketKeeper=0;

        for(PlayerDetails playerDetails: players){
            if(playerDetails.getRole().equals("Wicket-keeper")){
                wicketKeeper++;
            }
        }
        return wicketKeeper;
    }
    @Test
    public void readData() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        RCBTeam rcbTeam = mapper.readValue(new File(System.getProperty("user.dir") + "//TestData//players.json"), RCBTeam.class);
        List<PlayerDetails> detail = rcbTeam.getPlayer();
        System.out.println("The foreign player are " + validateForeignPlayer(detail));
        System.out.println("The wicket Keepers are " + wicketKeepSize(detail));
        Assert.assertEquals(validateForeignPlayer(detail),4);

        Assert.assertEquals(wicketKeepSize(detail),1);

    }

}
