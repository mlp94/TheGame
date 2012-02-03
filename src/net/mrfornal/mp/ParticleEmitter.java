/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mrfornal.mp;

import java.util.ArrayList;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Vector2f;

/**
 *
 * @author pham266693
 */
//rebuilding particles for custom use
//This has a location relative to the particle system
public class ParticleEmitter
{

    private ArrayList<Particle> particles; //contains currently used particles sent by this emitter
    private Vector2f position;
    MyEntityManager manager = MyEntityManager.getInstance();
    private float fadeSpeed;
    private float maxVelocity;
    Image particleImage;

    public ParticleEmitter()
    {
    }

    public ParticleEmitter(Vector2f p, float fS, Image img)
    {
        position = p;
        fadeSpeed = fS;
        particleImage = img;
    }

    public ParticleEmitter(float px, float py, float fS, Image img)
    {
        this(new Vector2f(px, py), fS, img);

    }

    public void sendParticle()
    {
        particles.add(manager.getUnusedParticle().setVars(fadeSpeed,
                (float) (maxVelocity * Math.random()), (float) (maxVelocity * Math.random()),
                position, particleImage));

    }

    public void rotate(double theta)
    {
        position.setTheta(theta);
    }
}
