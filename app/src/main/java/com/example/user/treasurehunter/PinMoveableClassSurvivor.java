package com.example.user.treasurehunter;

/**
 * @author Zach Curll, Matthew Finnegan, Alexander Kulpin, Dominic Marandino, Brandon Ostasewski, Paul Sigloch
 * @version Sprint 2
 */
public class PinMoveableClassSurvivor extends PinMoveable
{
    private final String pinName = "Survivor Pin";

    /**
     * Method that gets the Pin's name.
     * @return The pin Name.
     */
    @Override
    public String getPinName()
    {
        return pinName;
    }

    /**
     * Method that sets a Static color to Survivor Pins.
     */
    public PinMoveableClassSurvivor()
    {
        setColor("Red");
        setDefaultColor(0xffFF0000);
        setPinNameHint("Survivor");
        setDescriptionHint("A survivor has been spotted here!");
        setRadiusHint("0");
        setDegreeHint("0");
        setSpeedHint("0");
    }
}
