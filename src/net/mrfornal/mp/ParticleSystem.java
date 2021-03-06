/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mrfornal.mp;

import java.util.ArrayList;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.geom.Vector2f;

/**
 *
 * @author pham266693
 */
//rebuilding particles for custom use
//This class holds particle emitters at a specific location
public class ParticleSystem
{
    private ArrayList<ParticleEmitter> emitters;
    private Vector2f position;
    public boolean remove;//dirty solution!
    
    public ParticleSystem(Vector2f position)
    {
        this.position = position;
        emitters = new ArrayList<ParticleEmitter>();
    }
    public ParticleSystem(float px, float py)
    {
        this(new Vector2f(px,py));
    }

    public Vector2f getPosition()
    {
        return position;
    }

    public void setPosition(Vector2f position)
    {
        this.position = position;
    }
    
    public void addEmitter(ParticleEmitter e)
    {
        emitters.add(e);
    }

    public ArrayList<ParticleEmitter> getEmitters()
    {
        return emitters;
    }
          
    public void update(GameContainer container)
    {
        for (ParticleEmitter particleEmitter : emitters)
        {
            particleEmitter.update(position);
        }
    }
    
}
