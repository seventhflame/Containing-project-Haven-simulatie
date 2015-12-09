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
import com.jme3.scene.shape.Box;
import com.jme3.scene.Node;


/**
 *
 * @author Robin
 */
public class BinnenVaartPlatform extends Node {
    private AssetManager assetManager;
    public BinnenVaartPlatform(AssetManager assetManager) 
{
        this.assetManager = assetManager;
        float platformLengte = 80f;
        Box platform = new Box(platformLengte, 0.001f, 6f);
        Box containers = new Box(7.2f,0.001f, 1f);
        Geometry platformAlles = new Geometry("Box", platform);
        Geometry containerPlaats1 = new Geometry("Box", containers);
        Geometry containerPlaats2 = new Geometry("Box", containers);
        
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat2.setColor("Color", ColorRGBA.Orange);
        
        platformAlles.setMaterial(mat);
        containerPlaats1.setMaterial(mat2);
        containerPlaats2.setMaterial(mat2);
        containerPlaats1.setLocalTranslation(platformLengte/2 ,0.001f,0.4f);
        containerPlaats2.setLocalTranslation(-(platformLengte/2) ,0.001f,0.4f);
        attachChild(containerPlaats1);
        attachChild(containerPlaats2);
        attachChild(platformAlles);
        rotate(0,FastMath.HALF_PI, 0);
        
        //72 meter lang, 6.8 meter hoog en 10 meter breed
        
        BinnenvaartKraan kraan1 = new BinnenvaartKraan(assetManager);
        BinnenvaartKraan kraan2 = new BinnenvaartKraan(assetManager);
        BinnenvaartKraan kraan3 = new BinnenvaartKraan(assetManager);
        BinnenvaartKraan kraan4 = new BinnenvaartKraan(assetManager);
        BinnenvaartKraan kraan5 = new BinnenvaartKraan(assetManager);
        BinnenvaartKraan kraan6 = new BinnenvaartKraan(assetManager);
        BinnenvaartKraan kraan7 = new BinnenvaartKraan(assetManager);
        BinnenvaartKraan kraan8 = new BinnenvaartKraan(assetManager);
        // 3
        kraan1.setLocalTranslation(-70,2.5f,-2.5f);
        kraan2.setLocalTranslation(-50,2.5f,-2.5f);
        kraan3.setLocalTranslation(-30,2.5f,-2.5f);
        kraan4.setLocalTranslation(-10,2.5f,-2.5f);
        kraan5.setLocalTranslation(10,2.5f,-2.5f);
        kraan6.setLocalTranslation(30,2.5f,-2.5f);
        kraan7.setLocalTranslation(50,2.5f,-2.5f);
        kraan8.setLocalTranslation(70,2.5f,-2.5f);
        
        attachChild(kraan1);
        attachChild(kraan2);
        attachChild(kraan3);
        attachChild(kraan4);
        attachChild(kraan5);
        attachChild(kraan6);
        attachChild(kraan7);
        attachChild(kraan8);
        
}
}