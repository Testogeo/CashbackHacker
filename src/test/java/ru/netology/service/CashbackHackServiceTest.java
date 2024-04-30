package ru.netology.service;

import org.junit.Assert;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

        @org.junit.Test
        public void testRemainLessThanBoundary() {
            CashbackHackService service = new CashbackHackService();
            int amount = 0;
            int expected = 1000;
            int actual = service.remain(amount);
            Assert.assertEquals(expected, actual);
        }
        @org.junit.Test
        public void testRemain() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int expected = 0;
            int actual = service.remain(amount);
            Assert.assertEquals(expected, actual);
        }
        @org.junit.Test
        public void testRemainWithCashback() {
            CashbackHackService service = new CashbackHackService();
            int amount = 900;
            int expected = 100;
            int actual = service.remain(amount);
            Assert.assertEquals(expected, actual);
        }
    }

