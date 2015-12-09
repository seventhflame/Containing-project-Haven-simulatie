/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Cylinder;

/**
 *
 * @author Robin
 */
public class AGV extends Node {
    private AssetManager assetManager;
    public AGV(AssetManager assetManager) 
{
    this.assetManager = assetManager;
    
        Cylinder a = new Cylinder(20, 50, 0.1f, 0.05f, true);

        Box b = new Box(1.4f, 0.05f, 0.25f);
        Geometry geom = new Geometry("Box", b);
        Geometry geom2 = new Geometry("Cylinder", a);
        Geometry geom3 = new Geometry("Cylinder", a);
        Geometry geom4 = new Geometry("Cylinder", a);
        Geometry geom5 = new Geometry("Cylinder", a);

        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Yellow);
        Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat2.setColor("Color", ColorRGBA.Black);
        geom.setMaterial(mat);
        geom2.setMaterial(mat2);
        geom3.setMaterial(mat2);
        geom4.setMaterial(mat2);
        geom5.setMaterial(mat2);

        geom2.setLocalTranslation(1f, -0.05f,0.28f);
        geom3.setLocalTranslation(1f, -0.05f,-0.28f);
        geom4.setLocalTranslation(-1f, -0.05f,0.28f);
        geom5.setLocalTranslation(-1f, -0.05f,-0.28f);
        attachChild(geom);
        attachChild(geom2);
        attachChild(geom3);
        attachChild(geom4);
        attachChild(geom5);
        rotate(0,FastMath.HALF_PI, 0);
}
    
}