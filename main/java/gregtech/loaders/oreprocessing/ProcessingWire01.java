/*    */ package gregtech.loaders.oreprocessing;
/*    */ 
/*    */ import gregtech.api.enums.GT_Values;
/*    */ import gregtech.api.enums.ItemList;
/*    */ import gregtech.api.enums.Materials;
/*    */ import gregtech.api.enums.OrePrefixes;
/*    */ import gregtech.api.interfaces.internal.IGT_RecipeAdder;
/*    */ import gregtech.api.util.GT_ModHandler;
/*    */ import gregtech.api.util.GT_OreDictUnificator;
/*    */ import gregtech.api.util.GT_Utility;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class ProcessingWire01 implements gregtech.api.interfaces.IOreRecipeRegistrator
/*    */ {
/*    */   public ProcessingWire01()
/*    */   {
/* 17 */     OrePrefixes.wireGt01.add(this);
/*    */   }
/*    */   
/*    */   public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack)
/*    */   {
/* 22 */     GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt01, aMaterial, 1L), new Object[] { aOreDictName, OrePrefixes.plate.get(Materials.Rubber) });
/* 23 */     if (!aMaterial.contains(gregtech.api.enums.SubTag.NO_SMASHING)) {
/* 24 */       GT_Values.RA.addBenderRecipe(GT_Utility.copyAmount(1L, new Object[] { aStack }), GT_OreDictUnificator.get(OrePrefixes.springSmall, aMaterial, 2L), 100, 8);
/* 25 */       GT_Values.RA.addWiremillRecipe(GT_Utility.copyAmount(1L, new Object[] { aStack }), GT_OreDictUnificator.get(OrePrefixes.wireFine, aMaterial, 4L), 200, 8);
/*    */     }
/* 27 */     GT_Values.RA.addBoxingRecipe(GT_Utility.copyAmount(1L, new Object[] { aStack }), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Rubber, 1L), GT_OreDictUnificator.get(OrePrefixes.cableGt01, aMaterial, 1L), 100, 8);
/* 28 */     GT_Values.RA.addUnboxingRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt01, aMaterial, 1L), GT_Utility.copyAmount(1L, new Object[] { aStack }), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Rubber, 1L), 100, 8);
/* 29 */     GT_Values.RA.addAssemblerRecipe(GT_Utility.copyAmount(2L, new Object[] { aStack }), ItemList.Circuit_Integrated.getWithDamage(0L, 2L, new Object[0]), GT_OreDictUnificator.get(OrePrefixes.wireGt02, aMaterial, 1L), 150, 8);
/* 30 */     GT_Values.RA.addAssemblerRecipe(GT_Utility.copyAmount(4L, new Object[] { aStack }), ItemList.Circuit_Integrated.getWithDamage(0L, 4L, new Object[0]), GT_OreDictUnificator.get(OrePrefixes.wireGt04, aMaterial, 1L), 200, 8);
/* 31 */     GT_Values.RA.addAssemblerRecipe(GT_Utility.copyAmount(8L, new Object[] { aStack }), ItemList.Circuit_Integrated.getWithDamage(0L, 8L, new Object[0]), GT_OreDictUnificator.get(OrePrefixes.wireGt08, aMaterial, 1L), 300, 8);
/* 32 */     GT_Values.RA.addAssemblerRecipe(GT_Utility.copyAmount(12L, new Object[] { aStack }), ItemList.Circuit_Integrated.getWithDamage(0L, 12L, new Object[0]), GT_OreDictUnificator.get(OrePrefixes.wireGt12, aMaterial, 1L), 400, 8);
/* 33 */     GT_Values.RA.addAssemblerRecipe(GT_Utility.copyAmount(16L, new Object[] { aStack }), ItemList.Circuit_Integrated.getWithDamage(0L, 16L, new Object[0]), GT_OreDictUnificator.get(OrePrefixes.wireGt16, aMaterial, 1L), 500, 8);
/*    */   }
/*    */ }


/* Location:              F:\Torrent\minecraft\jdgui test\gregtech_1.7.10-5.07.07-dev.jar!\gregtech\loaders\oreprocessing\ProcessingWire01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1-SNAPSHOT-20140817
 */