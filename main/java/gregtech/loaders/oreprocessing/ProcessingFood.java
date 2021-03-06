/*    */ package gregtech.loaders.oreprocessing;
/*    */ 
/*    */ import gregtech.api.enums.GT_Values;
/*    */ import gregtech.api.enums.ItemList;
/*    */ import gregtech.api.enums.Materials;
/*    */ import gregtech.api.enums.OrePrefixes;
/*    */ import gregtech.api.interfaces.internal.IGT_RecipeAdder;
/*    */ import gregtech.api.objects.MaterialStack;
/*    */ import gregtech.api.util.GT_ModHandler;
/*    */ import gregtech.api.util.GT_OreDictUnificator;
/*    */ import gregtech.api.util.GT_Utility;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class ProcessingFood implements gregtech.api.interfaces.IOreRecipeRegistrator
/*    */ {
/*    */   public ProcessingFood()
/*    */   {
/* 18 */     OrePrefixes.food.add(this);
/*    */   }
/*    */   
/*    */   public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack)
/*    */   {
/* 23 */     if (aOreDictName.equals("foodCheese")) {
/* 24 */       GT_Values.RA.addSlicerRecipe(aStack, ItemList.Shape_Slicer_Flat.get(0L, new Object[0]), ItemList.Food_Sliced_Cheese.get(4L, new Object[0]), 64, 4);
/* 25 */       GT_OreDictUnificator.addItemData(aStack, new gregtech.api.objects.ItemData(Materials.Cheese, 3628800L, new MaterialStack[0]));
/* 26 */     } else if (aOreDictName.equals("foodDough")) {
/* 27 */       GT_ModHandler.removeFurnaceSmelting(aStack);
/* 28 */       GT_Values.RA.addBenderRecipe(GT_Utility.copyAmount(1L, new Object[] { aStack }), ItemList.Food_Flat_Dough.get(1L, new Object[0]), 16, 4);
/*    */       
/* 30 */       GT_Values.RA.addMixerRecipe(aStack, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sugar, 1L), null, null, null, null, ItemList.Food_Dough_Sugar.get(2L, new Object[0]), 32, 8);
/* 31 */       GT_Values.RA.addMixerRecipe(aStack, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Cocoa, 1L), null, null, null, null, ItemList.Food_Dough_Chocolate.get(2L, new Object[0]), 32, 8);
/* 32 */       GT_Values.RA.addMixerRecipe(aStack, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Chocolate, 1L), null, null, null, null, ItemList.Food_Dough_Chocolate.get(2L, new Object[0]), 32, 8);
/*    */       
/* 34 */       GT_Values.RA.addFormingPressRecipe(GT_Utility.copyAmount(1L, new Object[] { aStack }), ItemList.Shape_Mold_Bun.get(0L, new Object[0]), ItemList.Food_Raw_Bun.get(1L, new Object[0]), 128, 4);
/* 35 */       GT_Values.RA.addFormingPressRecipe(GT_Utility.copyAmount(2L, new Object[] { aStack }), ItemList.Shape_Mold_Bread.get(0L, new Object[0]), ItemList.Food_Raw_Bread.get(1L, new Object[0]), 256, 4);
/* 36 */       GT_Values.RA.addFormingPressRecipe(GT_Utility.copyAmount(3L, new Object[] { aStack }), ItemList.Shape_Mold_Baguette.get(0L, new Object[0]), ItemList.Food_Raw_Baguette.get(1L, new Object[0]), 384, 4);
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\Torrent\minecraft\jdgui test\gregtech_1.7.10-5.07.07-dev.jar!\gregtech\loaders\oreprocessing\ProcessingFood.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1-SNAPSHOT-20140817
 */