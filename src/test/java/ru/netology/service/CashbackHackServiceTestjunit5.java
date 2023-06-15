package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTestjunit5 {
    @Test
    public void shouldAdd200Junit5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_800;
        int expected = 200;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldAdd1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldAdd1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1_000;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldAdd999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldAdd0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

}