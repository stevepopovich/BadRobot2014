/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badrobot.commands;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Isaac
 */
public class Compress extends BadCommand
{
    boolean compressorEnabled;
    
    public Compress()
    {
        requires ((Subsystem) compressor);
    }

    protected void initialize() {
        compressorEnabled = compressor.isEnabled();
    }

    public String getConsoleIdentity() 
    {
        return "Compress";
    }

    protected void execute() 
    {
        if (!compressorEnabled)
        {
            compressor.startCompressor();
        }
    }

    protected boolean isFinished() 
    {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
