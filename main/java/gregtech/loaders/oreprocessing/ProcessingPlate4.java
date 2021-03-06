/*    */ package gregtech.loaders.oreprocessing;
/*    */ 
/*    */ import gregtech.api.GregTech_API;
/*    */ import gregtech.api.enums.GT_Values;
/*    */ import gregtech.api.enums.Materials;
/*    */ import gregtech.api.enums.OrePrefixes;
/*    */ import gregtech.api.interfaces.internal.IGT_RecipeAdder;
/*    */ import gregtech.api.util.GT_ModHandler;
/*    */ import gregtech.api.util.GT_OreDictUnificator;
/*    */ import gregtech.api.util.GT_Utility;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class ProcessingPlate4 implements gregtech.api.interfaces.IOreRecipeRegistrator
/*    */ {
/*    */   public ProcessingPlate4()
/*    */   {
/* 17 */     OrePrefixes.plateQuadruple.add(this);
/*    */   }
/*    */   
/*    */   public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack)
/*    */   {
/* 22 */     GT_ModHandler.removeRecipeByOutput(aStack);
/* 23 */     GregTech_API.registerCover(aStack, new gregtech.api.objects.GT_RenderedTexture(aMaterial.mIconSet.mTextures[74], aMaterial.mRGBa, false), null);
/* 24 */     if (!aMaterial.contains(gregtech.api.enums.SubTag.NO_WORKING)) GT_Values.RA.addCNCRecipe(GT_Utility.copyAmount(1L, new Object[] { aStack }), GT_OreDictUnificator.get(OrePrefixes.gearGt, aMaterial, 1L), (int)Math.max(aMaterial.getMass() * 2L, 1L), 32);
/* 25 */     if ((!aMaterial.contains(gregtech.api.enums.SubTag.NO_SMASHING)) && (GregTech_API.sRecipeFile.get(gregtech.api.enums.ConfigCategories.Tools.hammerquadrupleplate, OrePrefixes.plate.get(aMaterial).toString(), true))) {
/* 26 */       GT_ModHandler.addCraftingRecipe(GT_Utility.copyAmount(1L, new Object[] { aStack }), gregtech.api.util.GT_ModHandler.RecipeBits.DO_NOT_CHECK_FOR_COLLISIONS | gregtech.api.util.GT_ModHandler.RecipeBits.BUFFERED, new Object[] { "I", "B", "h", Character.valueOf('I'), OrePrefixes.plateTriple.get(aMaterial), Character.valueOf('B'), OrePrefixes.plate.get(aMaterial) });
/* 27 */       GT_ModHandler.addShapelessCraftingRecipe(GT_Utility.copyAmount(1L, new Object[] { aStack }), new Object[] { gregtech.api.enums.ToolDictNames.craftingToolForgeHammer, OrePrefixes.plate.get(aMaterial), OrePrefixes.plate.get(aMaterial), OrePrefixes.plate.get(aMaterial), OrePrefixes.plate.get(aMaterial) });
/*    */     } else {
/* 29 */       GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, aMaterial, 4L), gregtech.api.enums.ItemList.Circuit_Integrated.getWithDamage(0L, 4L, new Object[0]), Materials.Glue.getFluid(30L), GT_Utility.copyAmount(1L, new Object[] { aStack }), 128, 8);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\Torrent\minecraft\jdgui test\gregtech_1.7.10-5.07.07-dev.jar!\gregtech\loaders\oreprocessing\ProcessingPlate4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1-SNAPSHOT-20140817
 */