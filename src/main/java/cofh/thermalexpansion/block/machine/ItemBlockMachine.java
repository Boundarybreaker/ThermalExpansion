package cofh.thermalexpansion.block.machine;

import cofh.api.tileentity.IRedstoneControl.ControlMode;
import cofh.core.block.ItemBlockCore;
import cofh.lib.util.helpers.*;
import cofh.thermalexpansion.util.ReconfigurableHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockMachine extends ItemBlockCore {

	public static ItemStack setDefaultTag(ItemStack stack) {

		return setDefaultTag(stack, (byte) 0);
	}

	public static ItemStack setDefaultTag(ItemStack stack, byte level) {

		ReconfigurableHelper.setFacing(stack, 3);
		ReconfigurableHelper.setSideCache(stack, TileMachineBase.defaultSideConfig[stack.getItemDamage()].defaultSides);
		RedstoneControlHelper.setControl(stack, ControlMode.DISABLED);
		EnergyHelper.setDefaultEnergyTag(stack, 0);
		stack.getTagCompound().setByte("Level", level);

		return stack;
	}

	public static byte getLevel(ItemStack stack) {

		if (stack.getTagCompound() == null) {
			setDefaultTag(stack);
		}
		return stack.getTagCompound().getByte("Level");
	}

	public ItemBlockMachine(Block block) {

		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
		setNoRepair();
	}

	//	@Override
	//	public String getItemStackDisplayName(ItemStack stack) {
	//
	//		String unloc = getUnlocalizedNameInefficiently(stack);
	//		String unloc2 = '.' + NAMES[getLevel(stack)];
	//
	//		return StringHelper.localize(unloc) + " (" + StringHelper.localize("info.thermalexpansion" + unloc2) + ")";
	//	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "tile.thermalexpansion.machine." + BlockMachine.Type.byMetadata(ItemHelper.getItemDamage(stack)).getName() + ".name";
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {

		switch (getLevel(stack)) {
			case 3:
				return EnumRarity.RARE;
			case 2:
				return EnumRarity.UNCOMMON;
			default:
				return EnumRarity.COMMON;
		}
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {

		SecurityHelper.addOwnerInformation(stack, tooltip);
		if (StringHelper.displayShiftForDetail && !StringHelper.isShiftKeyDown()) {
			tooltip.add(StringHelper.shiftForDetails());
		}
		if (!StringHelper.isShiftKeyDown()) {
			return;
		}
		SecurityHelper.addAccessInformation(stack, tooltip);

		String name = BlockMachine.Type.byMetadata(ItemHelper.getItemDamage(stack)).getName();
		tooltip.add(StringHelper.getInfoText("info.thermalexpansion.machine." + name));

		RedstoneControlHelper.addRSControlInformation(stack, tooltip);
	}

}
