package com.bifan.txtreaderlib.main;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;

/**
 * Created by HP on 2017/11/26.
 */

public class TxtConfig {
    private static final String SAVE_NAME = "TxtConfig";
    private static final String C_TEXT_SIZE = "TEXT_SIZE ";
    private static final String C_TEXT_COLOR = "TEXT_COLOR";
    private static final String C_NOTE_TEXT_COLOR = "TEXT_COLOR";
    private static final String C_SLIDER_COLOR = "SLIDER_COLOR";
    private static final String C_SELECT_TEXT_COLOR = "SELECTED_TEXT_COLOR";
    private static final String C_BACKGROUND_COLOR = "BACKGROUND_COLOR";
    private static final String C_IS_SHOW_NOTE = "IS_SHOW_NOTE";
    private static final String C_CAN_PRESS_SELECT = "CAN_PRESS_SELECT";
    private static final String C_SWITCH_BY_TRANSLATE = "SWITCH_BY_TRANSLATE";
    private static final String C_BOLD = "BOLD ";
    private static final String C_CENTER_CLICK_AREA = "CENTER_CLICK_AREA";


    public static final int MAX_TEXT_SIZE = 150;//in px
    public static final int MIN_TEXT_SIZE = 60;//in px
    public static final int DEFAULT_SELECT_TEXT_COLOR = Color.parseColor("#44f6950b");
    public static final int DEFAULT_SLIDER_COLOR = Color.parseColor("#1f4cf5");
    public  int textSize = MIN_TEXT_SIZE;//字体大小
    public int textColor = Color.BLACK;//字体颜色
    public int backgroundColor = Color.WHITE;//背景颜色
    public int NoteColor = Color.RED;//笔记颜色
    public int SelectTextColor = DEFAULT_SELECT_TEXT_COLOR;//选中颜色
    public int SliderColor = DEFAULT_SLIDER_COLOR;//滑动条颜色
    public Boolean showNote = true;//是否显示笔记
    public Boolean canPressSelect = true;//是否能长按选中
    public Boolean SwitchByTranslate = true;//是否平移切换
    public Boolean Bold = false;//是否加粗
    public float CenterClickArea = 0.35f;//0~1,中间点击区域占View宽度的百分比，区域为高为宽两倍的矩形，如果为1f，说明点击翻页将不起效果


    private static final SharedPreferences getS(Context context) {
        SharedPreferences share = context.getSharedPreferences(SAVE_NAME, Context.MODE_PRIVATE);
        return share;
    }

    public static void saveTextSize(Context context, int textSize) {
        textSize = textSize < MIN_TEXT_SIZE ? MIN_TEXT_SIZE : textSize;
        textSize = textSize > MAX_TEXT_SIZE ? MAX_TEXT_SIZE : textSize;
        SharedPreferences share = getS(context);
        SharedPreferences.Editor editor = share.edit();
        editor.putInt(C_TEXT_SIZE, textSize);
        editor.commit();
    }

    public static int getTextSize(Context context) {
        SharedPreferences share = getS(context);
        return share.getInt(C_TEXT_SIZE, MIN_TEXT_SIZE);
    }

    public static void saveTextColor(Context context, int textColor) {
        SharedPreferences share = getS(context);
        SharedPreferences.Editor editor = share.edit();
        editor.putInt(C_TEXT_COLOR, textColor);
        editor.apply();
        editor.commit();
    }

    public static int getTextColor(Context context) {
        SharedPreferences share = getS(context);
        return share.getInt(C_TEXT_COLOR, Color.BLACK);
    }

    public static void saveNoteTextColor(Context context, int textColor) {
        SharedPreferences share = getS(context);
        SharedPreferences.Editor editor = share.edit();
        editor.putInt(C_NOTE_TEXT_COLOR, textColor);
        editor.apply();
        editor.commit();
    }

    public static int getNoteTextColor(Context context) {
        SharedPreferences share = getS(context);
        return share.getInt(C_NOTE_TEXT_COLOR, Color.BLACK);
    }

    public static void saveSelsetTextColor(Context context, int textColor) {
        SharedPreferences share = getS(context);
        SharedPreferences.Editor editor = share.edit();
        editor.putInt(C_SELECT_TEXT_COLOR, textColor);
        editor.apply();
        editor.commit();
    }

    public static int getSelectTextColor(Context context) {
        SharedPreferences share = getS(context);
        return share.getInt(C_SELECT_TEXT_COLOR,DEFAULT_SELECT_TEXT_COLOR);
    }


    public static void saveBackgroundColor(Context context, int BackgroundColor) {
        SharedPreferences share = getS(context);
        SharedPreferences.Editor editor = share.edit();
        editor.putInt(C_BACKGROUND_COLOR, BackgroundColor);
        editor.apply();
        editor.commit();
    }

    public static int getBackgroundColor(Context context) {
        SharedPreferences share = getS(context);
        return share.getInt(C_BACKGROUND_COLOR, Color.WHITE);
    }

    public static void saveCenterClickArea(Context context, float CenterClickArea) {
        SharedPreferences share = getS(context);
        SharedPreferences.Editor editor = share.edit();
        editor.putFloat(C_CENTER_CLICK_AREA, CenterClickArea);
        editor.apply();
        editor.commit();
    }

    public static float getCenterClickArea(Context context) {
        SharedPreferences share = getS(context);
        return share.getFloat(C_CENTER_CLICK_AREA, 0.3f);
    }

    public static void saveSliderColor(Context context, float CenterClickArea) {
        SharedPreferences share = getS(context);
        SharedPreferences.Editor editor = share.edit();
        editor.putFloat(C_SLIDER_COLOR, CenterClickArea);
        editor.apply();
        editor.commit();
    }

    public static int getSliderColor(Context context) {
        SharedPreferences share = getS(context);
        return share.getInt(C_SLIDER_COLOR, DEFAULT_SLIDER_COLOR);
    }

    public static void saveIsShowNote(Context context, Boolean IsShowNote) {
        SharedPreferences share = getS(context);
        SharedPreferences.Editor editor = share.edit();
        editor.putBoolean(C_IS_SHOW_NOTE, IsShowNote);
        editor.apply();
        editor.commit();
    }

    public static Boolean getIsShowNote(Context context) {
        SharedPreferences share = getS(context);
        return share.getBoolean(C_IS_SHOW_NOTE, true);
    }

    public static void saveCanPressSelect(Context context, Boolean CanPressSelect) {
        SharedPreferences share = getS(context);
        SharedPreferences.Editor editor = share.edit();
        editor.putBoolean(C_CAN_PRESS_SELECT, CanPressSelect);
        editor.apply();
        editor.commit();
    }

    public static Boolean getCanPressSelect(Context context) {
        SharedPreferences share = getS(context);
        return share.getBoolean(C_CAN_PRESS_SELECT, true);
    }

    public static void saveSwitchByTranslate(Context context, Boolean switchByTranslate) {
        SharedPreferences share = getS(context);
        SharedPreferences.Editor editor = share.edit();
        editor.putBoolean(C_SWITCH_BY_TRANSLATE, switchByTranslate);
        editor.apply();
        editor.commit();
    }

    public static Boolean isSwitchByTranslate(Context context) {
        SharedPreferences share = getS(context);
        return share.getBoolean(C_SWITCH_BY_TRANSLATE, false);
    }

    public static void saveIsBold(Context context, Boolean bold) {
        SharedPreferences share = getS(context);
        SharedPreferences.Editor editor = share.edit();
        editor.putBoolean(C_BOLD, bold);
        editor.apply();
        editor.commit();
    }

    public static Boolean isBold(Context context) {
        SharedPreferences share = getS(context);
        return share.getBoolean(C_BOLD, false);
    }
}
