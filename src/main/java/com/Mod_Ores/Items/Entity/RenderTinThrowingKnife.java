package com.Mod_Ores.Items.Entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderTinThrowingKnife extends Render
{
	private static final ResourceLocation field_110780_a = new ResourceLocation("soulforest:textures/entities/Tin_throwingKnife.png");

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void renderTinThrowingKnife(EntityTinThrowingKnife par1EntityTinThrowingKnife, double par2, double par4, double par6, float par8, float par9)
    {
    	Entity fb = (EntityTinThrowingKnife)par1EntityTinThrowingKnife;
    	double xzSize = par1EntityTinThrowingKnife.boundingBox.maxX -par1EntityTinThrowingKnife.boundingBox.minX;
    	double ySize = par1EntityTinThrowingKnife.boundingBox.maxY-par1EntityTinThrowingKnife.boundingBox.minY;
        GL11.glPushMatrix();
        Tessellator tessellator = Tessellator.instance;
        Minecraft.getMinecraft().renderEngine.getTexture(field_110780_a);
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(par2-xzSize/2, par4, par6-xzSize/2, 0, 0);
        tessellator.addVertexWithUV(par2-xzSize/2, par4+ySize, par6-xzSize/2, 0, 1);
        tessellator.addVertexWithUV(par2+xzSize/2, par4+ySize, par6-xzSize/2, 1, 1);
        tessellator.addVertexWithUV(par2+xzSize/2, par4, par6-xzSize/2, 1, 0);
        
        tessellator.addVertexWithUV(par2-xzSize/2, par4, par6-xzSize/2, 0, 0);
        tessellator.addVertexWithUV(par2+xzSize/2, par4, par6-xzSize/2, 1, 0);
        tessellator.addVertexWithUV(par2+xzSize/2, par4+ySize, par6-xzSize/2, 1, 1);
        tessellator.addVertexWithUV(par2-xzSize/2, par4+ySize, par6-xzSize/2, 0, 1);
        
        tessellator.addVertexWithUV(par2-xzSize/2, par4, par6-xzSize/2, 0, 0);
        tessellator.addVertexWithUV(par2-xzSize/2, par4, par6+xzSize/2, 0, 1);
        tessellator.addVertexWithUV(par2+xzSize/2, par4, par6+xzSize/2, 1, 1);
        tessellator.addVertexWithUV(par2+xzSize/2, par4, par6-xzSize/2, 1, 0);
        
        tessellator.addVertexWithUV(par2-xzSize/2, par4, par6-xzSize/2, 0, 0);
        tessellator.addVertexWithUV(par2+xzSize/2, par4, par6-xzSize/2, 1, 0);
        tessellator.addVertexWithUV(par2+xzSize/2, par4, par6+xzSize/2, 1, 1);
        tessellator.addVertexWithUV(par2-xzSize/2, par4, par6+xzSize/2, 0, 1);
        
        tessellator.addVertexWithUV(par2-xzSize/2, par4, par6-xzSize/2, 0, 0);
        tessellator.addVertexWithUV(par2-xzSize/2, par4, par6+xzSize/2, 0, 1);
        tessellator.addVertexWithUV(par2-xzSize/2, par4+ySize, par6+xzSize/2, 1, 1);
        tessellator.addVertexWithUV(par2-xzSize/2, par4+ySize, par6-xzSize/2, 1, 0);
        
        tessellator.addVertexWithUV(par2-xzSize/2, par4, par6-xzSize/2, 0, 0);
        tessellator.addVertexWithUV(par2-xzSize/2, par4+ySize, par6-xzSize/2, 1, 0);
        tessellator.addVertexWithUV(par2-xzSize/2, par4+ySize, par6+xzSize/2, 1, 1);
        tessellator.addVertexWithUV(par2-xzSize/2, par4, par6+xzSize/2, 0, 1);
        tessellator.draw();
        GL11.glPopMatrix();
        /*this.func_110777_b(par1EntityTinThrowingKnife);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par2, (float)par4, (float)par6);
        Minecraft.getMinecraft().renderEngine.func_110577_a(CommonProxy.FrostShard);
        GL11.glRotatef(par1EntityTinThrowingKnife.prevRotationYaw + (par1EntityTinThrowingKnife.rotationYaw - par1EntityTinThrowingKnife.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(par1EntityTinThrowingKnife.prevRotationPitch + (par1EntityTinThrowingKnife.rotationPitch - par1EntityTinThrowingKnife.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
        Tessellator tessellator = Tessellator.instance;
        byte b0 = 0;
        float f2 = 0.0F;
        float f3 = 0.5F;
        float f4 = (float)(0 + b0 * 10) / 32.0F;
        float f5 = (float)(5 + b0 * 10) / 32.0F;
        float f6 = 0.0F;
        float f7 = 0.15625F;
        float f8 = (float)(5 + b0 * 10) / 32.0F;
        float f9 = (float)(10 + b0 * 10) / 32.0F;
        float f10 = 0.05625F;
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        float f11 = (float)par1EntityTinThrowingKnife.arrowShake - par9;

        if (f11 > 0.0F)
        {
            float f12 = -MathHelper.sin(f11 * 3.0F) * f11;
            GL11.glRotatef(f12, 0.0F, 0.0F, 1.0F);
        }

        GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
        GL11.glScalef(f10, f10, f10);
        GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
        GL11.glNormal3f(f10, 0.0F, 0.0F);
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)f6, (double)f8);
        tessellator.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)f7, (double)f8);
        tessellator.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)f7, (double)f9);
        tessellator.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)f6, (double)f9);
        tessellator.draw();
        GL11.glNormal3f(-f10, 0.0F, 0.0F);
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)f6, (double)f8);
        tessellator.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)f7, (double)f8);
        tessellator.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)f7, (double)f9);
        tessellator.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)f6, (double)f9);
        tessellator.draw();

        for (int i = 0; i < 4; ++i)
        {
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glNormal3f(0.0F, 0.0F, f10);
            tessellator.startDrawingQuads();
            tessellator.addVertexWithUV(-8.0D, -2.0D, 0.0D, (double)f2, (double)f4);
            tessellator.addVertexWithUV(8.0D, -2.0D, 0.0D, (double)f3, (double)f4);
            tessellator.addVertexWithUV(8.0D, 2.0D, 0.0D, (double)f3, (double)f5);
            tessellator.addVertexWithUV(-8.0D, 2.0D, 0.0D, (double)f2, (double)f5);
            tessellator.draw();
        }

        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();*/
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderTinThrowingKnife((EntityTinThrowingKnife)par1Entity, par2, par4, par6, par8, par9);
    }
  
    protected ResourceLocation func_110779_a(EntityTinThrowingKnife par1EntityThrowingKnife)
    {
        return field_110780_a;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110779_a((EntityTinThrowingKnife)par1Entity);
    }

}
