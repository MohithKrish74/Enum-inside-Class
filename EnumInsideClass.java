package com.keyword;

public class EnumInsideClass
{
    public enum Direction {NORTH,SOUTH,EAST,WEST};
    public static void main(String[] args)
    {
        System.out.println("The Directions are: ");
        for(Direction direction : Direction.values())
        {
            System.out.println(direction);
        }
    }

}
