package com.floreantpos.model.base;

import java.lang.Comparable;
import java.io.Serializable;


/**
 * This is an object that contains data related to the MENU_ITEM table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="MENU_ITEM"
 */

public abstract class BaseMenuItem  implements Comparable, Serializable {

	public static String REF = "MenuItem";
	public static String PROP_BUY_PRICE = "buyPrice";
	public static String PROP_PARENT = "parent";
	public static String PROP_BARCODE = "barcode";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_SHOW_IMAGE_ONLY = "showImageOnly";
	public static String PROP_VISIBLE = "visible";
	public static String PROP_DISCOUNT_RATE = "discountRate";
	public static String PROP_SORT_ORDER = "sortOrder";
	public static String PROP_TAX = "tax";
	public static String PROP_IMAGE_DATA = "imageData";
	public static String PROP_NAME = "name";
	public static String PROP_PRINTER_GROUP = "printerGroup";
	public static String PROP_TEXT_COLOR_CODE = "textColorCode";
	public static String PROP_RECEPIE = "recepie";
	public static String PROP_PRICE = "price";
	public static String PROP_BUTTON_COLOR_CODE = "buttonColorCode";
	public static String PROP_ID = "id";
	public static String PROP_TRANSLATED_NAME = "translatedName";


	// constructors
	public BaseMenuItem () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMenuItem (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseMenuItem (
		java.lang.Integer id,
		java.lang.String name,
		java.lang.Double buyPrice,
		java.lang.Double price) {

		this.setId(id);
		this.setName(name);
		this.setBuyPrice(buyPrice);
		this.setPrice(price);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
		protected java.lang.String name;
		protected java.lang.String description;
		protected java.lang.String translatedName;
		protected java.lang.String barcode;
		protected java.lang.Double buyPrice;
		protected java.lang.Double price;
		protected java.lang.Double discountRate;
		protected java.lang.Boolean visible;
		protected java.lang.Integer sortOrder;
		protected java.lang.Integer buttonColorCode;
		protected java.lang.Integer textColorCode;
		protected byte[] imageData;
		protected java.lang.Boolean showImageOnly;

	// many to one
	private com.floreantpos.model.MenuGroup parent;
	private com.floreantpos.model.Tax tax;
	private com.floreantpos.model.Recepie recepie;
	private com.floreantpos.model.PrinterGroup printerGroup;

	// collections
	private java.util.List<com.floreantpos.model.MenuItemShift> shifts;
	private java.util.List<com.floreantpos.model.Discount> discounts;
	private java.util.List<com.floreantpos.model.MenuItemModifierGroup> menuItemModiferGroups;
	private java.util.List<com.floreantpos.model.Terminal> terminals;
	private java.util.Map<String,String> properties;
	private java.util.List<String> orderType;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="ID"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: NAME
	 */
	public java.lang.String getName () {
					return name;
			}

	/**
	 * Set the value related to the column: NAME
	 * @param name the NAME value
	 */
	public void setName (java.lang.String name) {
		this.name = name;
	}



	/**
	 * Return the value associated with the column: DESCRIPTION
	 */
	public java.lang.String getDescription () {
					return description;
			}

	/**
	 * Set the value related to the column: DESCRIPTION
	 * @param description the DESCRIPTION value
	 */
	public void setDescription (java.lang.String description) {
		this.description = description;
	}



	/**
	 * Return the value associated with the column: TRANSLATED_NAME
	 */
	public java.lang.String getTranslatedName () {
					return translatedName;
			}

	/**
	 * Set the value related to the column: TRANSLATED_NAME
	 * @param translatedName the TRANSLATED_NAME value
	 */
	public void setTranslatedName (java.lang.String translatedName) {
		this.translatedName = translatedName;
	}



	/**
	 * Return the value associated with the column: BARCODE
	 */
	public java.lang.String getBarcode () {
					return barcode;
			}

	/**
	 * Set the value related to the column: BARCODE
	 * @param barcode the BARCODE value
	 */
	public void setBarcode (java.lang.String barcode) {
		this.barcode = barcode;
	}



	/**
	 * Return the value associated with the column: BUY_PRICE
	 */
	public java.lang.Double getBuyPrice () {
									return buyPrice == null ? Double.valueOf(0) : buyPrice;
					}

	/**
	 * Set the value related to the column: BUY_PRICE
	 * @param buyPrice the BUY_PRICE value
	 */
	public void setBuyPrice (java.lang.Double buyPrice) {
		this.buyPrice = buyPrice;
	}



	/**
	 * Return the value associated with the column: PRICE
	 */
	public java.lang.Double getPrice () {
									return price == null ? Double.valueOf(0) : price;
					}

	/**
	 * Set the value related to the column: PRICE
	 * @param price the PRICE value
	 */
	public void setPrice (java.lang.Double price) {
		this.price = price;
	}



	/**
	 * Return the value associated with the column: DISCOUNT_RATE
	 */
	public java.lang.Double getDiscountRate () {
									return discountRate == null ? Double.valueOf(0) : discountRate;
					}

	/**
	 * Set the value related to the column: DISCOUNT_RATE
	 * @param discountRate the DISCOUNT_RATE value
	 */
	public void setDiscountRate (java.lang.Double discountRate) {
		this.discountRate = discountRate;
	}



	/**
	 * Return the value associated with the column: VISIBLE
	 */
	public java.lang.Boolean isVisible () {
									return visible == null ? Boolean.valueOf(true) : visible;
						}

	/**
	 * Set the value related to the column: VISIBLE
	 * @param visible the VISIBLE value
	 */
	public void setVisible (java.lang.Boolean visible) {
		this.visible = visible;
	}


	/**
	 * Custom property
	 */
	public static String getVisibleDefaultValue () {
		return "true";
	}


	/**
	 * Return the value associated with the column: SORT_ORDER
	 */
	public java.lang.Integer getSortOrder () {
									return sortOrder == null ? Integer.valueOf(0) : sortOrder;
					}

	/**
	 * Set the value related to the column: SORT_ORDER
	 * @param sortOrder the SORT_ORDER value
	 */
	public void setSortOrder (java.lang.Integer sortOrder) {
		this.sortOrder = sortOrder;
	}



	/**
	 * Return the value associated with the column: BTN_COLOR
	 */
	public java.lang.Integer getButtonColorCode () {
									return buttonColorCode == null ? null : buttonColorCode;
						}

	/**
	 * Set the value related to the column: BTN_COLOR
	 * @param buttonColorCode the BTN_COLOR value
	 */
	public void setButtonColorCode (java.lang.Integer buttonColorCode) {
		this.buttonColorCode = buttonColorCode;
	}


	/**
	 * Custom property
	 */
	public static String getButtonColorCodeDefaultValue () {
		return "null";
	}


	/**
	 * Return the value associated with the column: TEXT_COLOR
	 */
	public java.lang.Integer getTextColorCode () {
									return textColorCode == null ? null : textColorCode;
						}

	/**
	 * Set the value related to the column: TEXT_COLOR
	 * @param textColorCode the TEXT_COLOR value
	 */
	public void setTextColorCode (java.lang.Integer textColorCode) {
		this.textColorCode = textColorCode;
	}


	/**
	 * Custom property
	 */
	public static String getTextColorCodeDefaultValue () {
		return "null";
	}


	/**
	 * Return the value associated with the column: IMAGE
	 */
	public byte[] getImageData () {
					return imageData;
			}

	/**
	 * Set the value related to the column: IMAGE
	 * @param imageData the IMAGE value
	 */
	public void setImageData (byte[] imageData) {
		this.imageData = imageData;
	}



	/**
	 * Return the value associated with the column: SHOW_IMAGE_ONLY
	 */
	public java.lang.Boolean isShowImageOnly () {
								return showImageOnly == null ? Boolean.FALSE : showImageOnly;
					}

	/**
	 * Set the value related to the column: SHOW_IMAGE_ONLY
	 * @param showImageOnly the SHOW_IMAGE_ONLY value
	 */
	public void setShowImageOnly (java.lang.Boolean showImageOnly) {
		this.showImageOnly = showImageOnly;
	}



	/**
	 * Return the value associated with the column: GROUP_ID
	 */
	public com.floreantpos.model.MenuGroup getParent () {
					return parent;
			}

	/**
	 * Set the value related to the column: GROUP_ID
	 * @param parent the GROUP_ID value
	 */
	public void setParent (com.floreantpos.model.MenuGroup parent) {
		this.parent = parent;
	}



	/**
	 * Return the value associated with the column: TAX_ID
	 */
	public com.floreantpos.model.Tax getTax () {
					return tax;
			}

	/**
	 * Set the value related to the column: TAX_ID
	 * @param tax the TAX_ID value
	 */
	public void setTax (com.floreantpos.model.Tax tax) {
		this.tax = tax;
	}



	/**
	 * Return the value associated with the column: RECEPIE
	 */
	public com.floreantpos.model.Recepie getRecepie () {
					return recepie;
			}

	/**
	 * Set the value related to the column: RECEPIE
	 * @param recepie the RECEPIE value
	 */
	public void setRecepie (com.floreantpos.model.Recepie recepie) {
		this.recepie = recepie;
	}



	/**
	 * Return the value associated with the column: PG_ID
	 */
	public com.floreantpos.model.PrinterGroup getPrinterGroup () {
					return printerGroup;
			}

	/**
	 * Set the value related to the column: PG_ID
	 * @param printerGroup the PG_ID value
	 */
	public void setPrinterGroup (com.floreantpos.model.PrinterGroup printerGroup) {
		this.printerGroup = printerGroup;
	}



	/**
	 * Return the value associated with the column: shifts
	 */
	public java.util.List<com.floreantpos.model.MenuItemShift> getShifts () {
					return shifts;
			}

	/**
	 * Set the value related to the column: shifts
	 * @param shifts the shifts value
	 */
	public void setShifts (java.util.List<com.floreantpos.model.MenuItemShift> shifts) {
		this.shifts = shifts;
	}

	public void addToshifts (com.floreantpos.model.MenuItemShift menuItemShift) {
		if (null == getShifts()) setShifts(new java.util.ArrayList<com.floreantpos.model.MenuItemShift>());
		getShifts().add(menuItemShift);
	}



	/**
	 * Return the value associated with the column: discounts
	 */
	public java.util.List<com.floreantpos.model.Discount> getDiscounts () {
					return discounts;
			}

	/**
	 * Set the value related to the column: discounts
	 * @param discounts the discounts value
	 */
	public void setDiscounts (java.util.List<com.floreantpos.model.Discount> discounts) {
		this.discounts = discounts;
	}

	public void addTodiscounts (com.floreantpos.model.Discount discount) {
		if (null == getDiscounts()) setDiscounts(new java.util.ArrayList<com.floreantpos.model.Discount>());
		getDiscounts().add(discount);
	}



	/**
	 * Return the value associated with the column: menuItemModiferGroups
	 */
	public java.util.List<com.floreantpos.model.MenuItemModifierGroup> getMenuItemModiferGroups () {
					return menuItemModiferGroups;
			}

	/**
	 * Set the value related to the column: menuItemModiferGroups
	 * @param menuItemModiferGroups the menuItemModiferGroups value
	 */
	public void setMenuItemModiferGroups (java.util.List<com.floreantpos.model.MenuItemModifierGroup> menuItemModiferGroups) {
		this.menuItemModiferGroups = menuItemModiferGroups;
	}

	public void addTomenuItemModiferGroups (com.floreantpos.model.MenuItemModifierGroup menuItemModifierGroup) {
		if (null == getMenuItemModiferGroups()) setMenuItemModiferGroups(new java.util.ArrayList<com.floreantpos.model.MenuItemModifierGroup>());
		getMenuItemModiferGroups().add(menuItemModifierGroup);
	}



	/**
	 * Return the value associated with the column: terminals
	 */
	public java.util.List<com.floreantpos.model.Terminal> getTerminals () {
					return terminals;
			}

	/**
	 * Set the value related to the column: terminals
	 * @param terminals the terminals value
	 */
	public void setTerminals (java.util.List<com.floreantpos.model.Terminal> terminals) {
		this.terminals = terminals;
	}

	public void addToterminals (com.floreantpos.model.Terminal terminal) {
		if (null == getTerminals()) setTerminals(new java.util.ArrayList<com.floreantpos.model.Terminal>());
		getTerminals().add(terminal);
	}



	/**
	 * Return the value associated with the column: properties
	 */
	public java.util.Map<String,String> getProperties () {
					return properties;
			}

	/**
	 * Set the value related to the column: properties
	 * @param properties the properties value
	 */
	public void setProperties (java.util.Map<String,String> properties) {
		this.properties = properties;
	}



	/**
	 * Return the value associated with the column: orderType
	 */
	public java.util.List<String> getOrderType () {
					return orderType;
			}

	/**
	 * Set the value related to the column: orderType
	 * @param orderType the orderType value
	 */
	public void setOrderType (java.util.List<String> orderType) {
		this.orderType = orderType;
	}





	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.floreantpos.model.MenuItem)) return false;
		else {
			com.floreantpos.model.MenuItem menuItem = (com.floreantpos.model.MenuItem) obj;
			if (null == this.getId() || null == menuItem.getId()) return false;
			else return (this.getId().equals(menuItem.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

	public int compareTo (Object obj) {
		if (obj.hashCode() > hashCode()) return 1;
		else if (obj.hashCode() < hashCode()) return -1;
		else return 0;
	}

	public String toString () {
		return super.toString();
	}


}