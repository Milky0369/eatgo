package kr.co.fastcampus.eatgo.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class RestaurantTest {

    @Test
    public void creation() {

        Restaurant restaurant = new Restaurant("Bob zip", "");

        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getAddress(), is("Seoul")); 

    }

    @Test
    public void information() {

        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");

        assertThat(restaurant.getInfomation(), is("Bob zip in Seoul"));

    }

}