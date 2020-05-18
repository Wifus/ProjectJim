package me.Josh444.ProjectJim.Utils;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class PlayerStats {

	public static String[] attributes(Player p) {
		
		String health = ChatColor.RED + "❤ Health " + p.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
		String armor = ChatColor.DARK_GREEN + "❈ Armor " + p.getAttribute(Attribute.GENERIC_ARMOR).getValue();
		String armorToughness = ChatColor.DARK_GRAY + "❂ Armor Toughness " + p.getAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS).getValue();
		String knockbackResistance = ChatColor.DARK_PURPLE + "۞ Knockback Resistance " + p.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).getValue();
		String damage = ChatColor.DARK_RED + "✄ Damage " + p.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).getValue();
		String attackSpeed = ChatColor.AQUA + "✦ Attack Speed " + p.getAttribute(Attribute.GENERIC_ATTACK_SPEED).getValue();
		String movementSpeed = ChatColor.WHITE + "✧ Speed " + p.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue();
		String luck = ChatColor.GREEN + "♣ Luck " + p.getAttribute(Attribute.GENERIC_LUCK).getValue();
		
		String[] stats = new String[] {health, armor, armorToughness, knockbackResistance, damage, attackSpeed, movementSpeed, luck};
		
		return stats;
	}
}
