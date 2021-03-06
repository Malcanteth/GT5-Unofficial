/*    */ package gregtech.loaders.oreprocessing;
/*    */ 
/*    */ import gregtech.api.enums.GT_Values;
/*    */ import gregtech.api.enums.Materials;
/*    */ import gregtech.api.enums.OrePrefixes;
/*    */ import gregtech.api.interfaces.internal.IGT_RecipeAdder;
/*    */ import gregtech.api.util.GT_OreDictUnificator;
/*    */ import gregtech.api.util.GT_Utility;
/*    */ import net.minecraft.init.Blocks;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class ProcessingSand implements gregtech.api.interfaces.IOreRecipeRegistrator
/*    */ {
/*    */   public ProcessingSand()
/*    */   {
/* 16 */     OrePrefixes.sand.add(this);
/*    */   }
/*    */   
/*    */   public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack)
/*    */   {
/* 21 */     if (aOreDictName.equals("sandCracked")) {
/* 22 */       GT_Values.RA.addCentrifugeRecipe(GT_Utility.copyAmount(16L, new Object[] { aStack }), -1, gregtech.api.util.GT_ModHandler.getFuelCan(25000), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Saltpeter, 8L), null, null, null, new ItemStack(Blocks.sand, 10), 2500);
/* 23 */     } else if (aOreDictName.equals("sandOil")) {
/* 24 */       GT_Values.RA.addCentrifugeRecipe(GT_Utility.copyAmount(2L, new Object[] { aStack }), 1, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Oil, 1L), new ItemStack(Blocks.sand, 1, 0), null, null, null, null, 1000);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\Torrent\minecraft\jdgui test\gregtech_1.7.10-5.07.07-dev.jar!\gregtech\loaders\oreprocessing\ProcessingSand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1-SNAPSHOT-20140817
 */