// Date: 23-7-2013 21:18:26
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package com.Mod_Ores.Mobs.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFurivoli extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer BodyBottom;
  
  public ModelFurivoli()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(0F, 0F, 0F, 16, 16, 16);
      Head.setRotationPoint(-4F, -4F, -4F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      BodyBottom = new ModelRenderer(this, 0, 32);
      BodyBottom.addBox(0F, 0F, 0F, 14, 16, 14);
      BodyBottom.setRotationPoint(-3.5F, 8F, -3.5F);
      BodyBottom.setTextureSize(64, 64);
      BodyBottom.mirror = true;
      setRotation(BodyBottom, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    BodyBottom.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
	    //this.Head.rotateAngleX = par5 / (180F / (float)Math.PI);
	    //this.Head.rotateAngleY = par4 / (180F / (float)Math.PI);
    //super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
