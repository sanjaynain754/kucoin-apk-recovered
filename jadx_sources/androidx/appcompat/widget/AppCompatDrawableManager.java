package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0467R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class AppCompatDrawableManager {
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String TAG = "AppCompatDrawableManag";
    private ResourceManagerInternal mResourceManager;

    public synchronized Drawable getDrawable(@NonNull Context context, @DrawableRes int i11) {
        return this.mResourceManager.getDrawable(context, i11);
    }

    public synchronized ColorStateList getTintList(@NonNull Context context, @DrawableRes int i11) {
        return this.mResourceManager.getTintList(context, i11);
    }

    public synchronized void onConfigurationChanged(@NonNull Context context) {
        this.mResourceManager.onConfigurationChanged(context);
    }

    public synchronized Drawable onDrawableLoadedFromResources(@NonNull Context context, @NonNull VectorEnabledTintResources vectorEnabledTintResources, @DrawableRes int i11) {
        return this.mResourceManager.onDrawableLoadedFromResources(context, vectorEnabledTintResources, i11);
    }

    public static synchronized AppCompatDrawableManager get() {
        try {
            if (INSTANCE == null) {
                preload();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return INSTANCE;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i11, PorterDuff.Mode mode) {
        return ResourceManagerInternal.getPorterDuffColorFilter(i11, mode);
    }

    public static synchronized void preload() {
        if (INSTANCE == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            INSTANCE = appCompatDrawableManager;
            appCompatDrawableManager.mResourceManager = ResourceManagerInternal.get();
            INSTANCE.mResourceManager.setHooks(new ResourceManagerInternal.ResourceManagerHooks() { // from class: androidx.appcompat.widget.AppCompatDrawableManager.1
                private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {C0467R.drawable.abc_textfield_search_default_mtrl_alpha, C0467R.drawable.abc_textfield_default_mtrl_alpha, C0467R.drawable.abc_ab_share_pack_mtrl_alpha};
                private final int[] TINT_COLOR_CONTROL_NORMAL = {C0467R.drawable.abc_ic_commit_search_api_mtrl_alpha, C0467R.drawable.abc_seekbar_tick_mark_material, C0467R.drawable.abc_ic_menu_share_mtrl_alpha, C0467R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C0467R.drawable.abc_ic_menu_cut_mtrl_alpha, C0467R.drawable.abc_ic_menu_selectall_mtrl_alpha, C0467R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {C0467R.drawable.abc_textfield_activated_mtrl_alpha, C0467R.drawable.abc_textfield_search_activated_mtrl_alpha, C0467R.drawable.abc_cab_background_top_mtrl_alpha, C0467R.drawable.abc_text_cursor_material, C0467R.drawable.abc_text_select_handle_left_mtrl, C0467R.drawable.abc_text_select_handle_middle_mtrl, C0467R.drawable.abc_text_select_handle_right_mtrl};
                private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {C0467R.drawable.abc_popup_background_mtrl_mult, C0467R.drawable.abc_cab_background_internal_bg, C0467R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                private final int[] TINT_COLOR_CONTROL_STATE_LIST = {C0467R.drawable.abc_tab_indicator_material, C0467R.drawable.abc_textfield_search_material};
                private final int[] TINT_CHECKABLE_BUTTON_LIST = {C0467R.drawable.abc_btn_check_material, C0467R.drawable.abc_btn_radio_material, C0467R.drawable.abc_btn_check_material_anim, C0467R.drawable.abc_btn_radio_material_anim};

                private boolean arrayContains(int[] iArr, int i11) {
                    for (int i12 : iArr) {
                        if (i12 == i11) {
                            return true;
                        }
                    }
                    return false;
                }

                private ColorStateList createBorderlessButtonColorStateList(@NonNull Context context) {
                    return createButtonColorStateList(context, 0);
                }

                private ColorStateList createButtonColorStateList(@NonNull Context context, @ColorInt int i11) {
                    int themeAttrColor = ThemeUtils.getThemeAttrColor(context, C0467R.attr.colorControlHighlight);
                    return new ColorStateList(new int[][]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{ThemeUtils.getDisabledThemeAttrColor(context, C0467R.attr.colorButtonNormal), ColorUtils.compositeColors(themeAttrColor, i11), ColorUtils.compositeColors(themeAttrColor, i11), i11});
                }

                private ColorStateList createSwitchThumbColorStateList(Context context) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    int i11 = C0467R.attr.colorSwitchThumbNormal;
                    ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, i11);
                    if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
                        iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                        iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, i11);
                        iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                        iArr2[1] = ThemeUtils.getThemeAttrColor(context, C0467R.attr.colorControlActivated);
                        iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                        iArr2[2] = ThemeUtils.getThemeAttrColor(context, i11);
                    } else {
                        int[] iArr3 = ThemeUtils.DISABLED_STATE_SET;
                        iArr[0] = iArr3;
                        iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                        iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                        iArr2[1] = ThemeUtils.getThemeAttrColor(context, C0467R.attr.colorControlActivated);
                        iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                        iArr2[2] = themeAttrColorStateList.getDefaultColor();
                    }
                    return new ColorStateList(iArr, iArr2);
                }

                private LayerDrawable getRatingBarLayerDrawable(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, @DimenRes int i11) {
                    BitmapDrawable bitmapDrawable;
                    BitmapDrawable bitmapDrawable2;
                    BitmapDrawable bitmapDrawable3;
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
                    Drawable drawable = resourceManagerInternal.getDrawable(context, C0467R.drawable.abc_star_black_48dp);
                    Drawable drawable2 = resourceManagerInternal.getDrawable(context, C0467R.drawable.abc_star_half_black_48dp);
                    if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                        bitmapDrawable = (BitmapDrawable) drawable;
                        bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                    } else {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        drawable.draw(canvas);
                        bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                        bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
                    }
                    bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                    if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                        bitmapDrawable3 = (BitmapDrawable) drawable2;
                    } else {
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                        drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        drawable2.draw(canvas2);
                        bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
                    }
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                    layerDrawable.setId(0, R.id.background);
                    layerDrawable.setId(1, R.id.secondaryProgress);
                    layerDrawable.setId(2, R.id.progress);
                    return layerDrawable;
                }

                private ColorStateList createColoredButtonColorStateList(@NonNull Context context) {
                    return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, C0467R.attr.colorAccent));
                }

                private ColorStateList createDefaultButtonColorStateList(@NonNull Context context) {
                    return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, C0467R.attr.colorButtonNormal));
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public Drawable createDrawableFor(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, int i11) {
                    if (i11 == C0467R.drawable.abc_cab_background_top_material) {
                        return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, C0467R.drawable.abc_cab_background_internal_bg), resourceManagerInternal.getDrawable(context, C0467R.drawable.abc_cab_background_top_mtrl_alpha)});
                    }
                    if (i11 == C0467R.drawable.abc_ratingbar_material) {
                        return getRatingBarLayerDrawable(resourceManagerInternal, context, C0467R.dimen.abc_star_big);
                    }
                    if (i11 == C0467R.drawable.abc_ratingbar_indicator_material) {
                        return getRatingBarLayerDrawable(resourceManagerInternal, context, C0467R.dimen.abc_star_medium);
                    }
                    if (i11 == C0467R.drawable.abc_ratingbar_small_material) {
                        return getRatingBarLayerDrawable(resourceManagerInternal, context, C0467R.dimen.abc_star_small);
                    }
                    return null;
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public ColorStateList getTintListForDrawableRes(@NonNull Context context, int i11) {
                    if (i11 == C0467R.drawable.abc_edit_text_material) {
                        return AppCompatResources.getColorStateList(context, C0467R.color.abc_tint_edittext);
                    }
                    if (i11 == C0467R.drawable.abc_switch_track_mtrl_alpha) {
                        return AppCompatResources.getColorStateList(context, C0467R.color.abc_tint_switch_track);
                    }
                    if (i11 == C0467R.drawable.abc_switch_thumb_material) {
                        return createSwitchThumbColorStateList(context);
                    }
                    if (i11 == C0467R.drawable.abc_btn_default_mtrl_shape) {
                        return createDefaultButtonColorStateList(context);
                    }
                    if (i11 == C0467R.drawable.abc_btn_borderless_material) {
                        return createBorderlessButtonColorStateList(context);
                    }
                    if (i11 == C0467R.drawable.abc_btn_colored_material) {
                        return createColoredButtonColorStateList(context);
                    }
                    if (i11 == C0467R.drawable.abc_spinner_mtrl_am_alpha || i11 == C0467R.drawable.abc_spinner_textfield_background_material) {
                        return AppCompatResources.getColorStateList(context, C0467R.color.abc_tint_spinner);
                    }
                    if (arrayContains(this.TINT_COLOR_CONTROL_NORMAL, i11)) {
                        return ThemeUtils.getThemeAttrColorStateList(context, C0467R.attr.colorControlNormal);
                    }
                    if (arrayContains(this.TINT_COLOR_CONTROL_STATE_LIST, i11)) {
                        return AppCompatResources.getColorStateList(context, C0467R.color.abc_tint_default);
                    }
                    if (arrayContains(this.TINT_CHECKABLE_BUTTON_LIST, i11)) {
                        return AppCompatResources.getColorStateList(context, C0467R.color.abc_tint_btn_checkable);
                    }
                    if (i11 == C0467R.drawable.abc_seekbar_thumb_material) {
                        return AppCompatResources.getColorStateList(context, C0467R.color.abc_tint_seek_thumb);
                    }
                    return null;
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public PorterDuff.Mode getTintModeForDrawableRes(int i11) {
                    if (i11 == C0467R.drawable.abc_switch_thumb_material) {
                        return PorterDuff.Mode.MULTIPLY;
                    }
                    return null;
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public boolean tintDrawable(@NonNull Context context, int i11, @NonNull Drawable drawable) {
                    if (i11 == C0467R.drawable.abc_seekbar_track_material) {
                        LayerDrawable layerDrawable = (LayerDrawable) drawable;
                        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                        int i12 = C0467R.attr.colorControlNormal;
                        setPorterDuffColorFilter(drawableFindDrawableByLayerId, ThemeUtils.getThemeAttrColor(context, i12), AppCompatDrawableManager.DEFAULT_MODE);
                        setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, i12), AppCompatDrawableManager.DEFAULT_MODE);
                        setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(R.id.progress), ThemeUtils.getThemeAttrColor(context, C0467R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                        return true;
                    }
                    if (i11 != C0467R.drawable.abc_ratingbar_material && i11 != C0467R.drawable.abc_ratingbar_indicator_material && i11 != C0467R.drawable.abc_ratingbar_small_material) {
                        return false;
                    }
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(R.id.background), ThemeUtils.getDisabledThemeAttrColor(context, C0467R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                    Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                    int i13 = C0467R.attr.colorControlActivated;
                    setPorterDuffColorFilter(drawableFindDrawableByLayerId2, ThemeUtils.getThemeAttrColor(context, i13), AppCompatDrawableManager.DEFAULT_MODE);
                    setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(R.id.progress), ThemeUtils.getThemeAttrColor(context, i13), AppCompatDrawableManager.DEFAULT_MODE);
                    return true;
                }

                private void setPorterDuffColorFilter(Drawable drawable, int i11, PorterDuff.Mode mode) {
                    Drawable drawableMutate = drawable.mutate();
                    if (mode == null) {
                        mode = AppCompatDrawableManager.DEFAULT_MODE;
                    }
                    drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i11, mode));
                }

                /* JADX WARN: Code duplicated, block: B:23:0x0050  */
                /* JADX WARN: Code duplicated, block: B:25:0x0061  */
                /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public boolean tintDrawableUsingColorFilter(@NonNull Context context, int i11, @NonNull Drawable drawable) {
                    int i12;
                    boolean z11;
                    int iRound;
                    Drawable drawableMutate;
                    PorterDuff.Mode mode = AppCompatDrawableManager.DEFAULT_MODE;
                    if (arrayContains(this.COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i11)) {
                        i12 = C0467R.attr.colorControlNormal;
                    } else {
                        if (arrayContains(this.COLORFILTER_COLOR_CONTROL_ACTIVATED, i11)) {
                            i12 = C0467R.attr.colorControlActivated;
                        } else {
                            if (arrayContains(this.COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i11)) {
                                mode = PorterDuff.Mode.MULTIPLY;
                            } else {
                                if (i11 == C0467R.drawable.abc_list_divider_mtrl_alpha) {
                                    iRound = Math.round(40.8f);
                                    i12 = 16842800;
                                    mode = mode;
                                } else if (i11 != C0467R.drawable.abc_dialog_material_background) {
                                    i12 = 0;
                                    z11 = false;
                                    iRound = -1;
                                }
                                z11 = true;
                            }
                            mode = mode;
                            iRound = -1;
                            i12 = 16842801;
                            z11 = true;
                        }
                        if (z11) {
                            return false;
                        }
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i12), mode));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        return true;
                    }
                    z11 = true;
                    iRound = -1;
                    if (z11) {
                        return false;
                    }
                    drawableMutate = drawable.mutate();
                    drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i12), mode));
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                    return true;
                }
            });
        }
    }

    public synchronized Drawable getDrawable(@NonNull Context context, @DrawableRes int i11, boolean z11) {
        return this.mResourceManager.getDrawable(context, i11, z11);
    }

    public boolean tintDrawableUsingColorFilter(@NonNull Context context, @DrawableRes int i11, @NonNull Drawable drawable) {
        return this.mResourceManager.tintDrawableUsingColorFilter(context, i11, drawable);
    }

    public static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ResourceManagerInternal.tintDrawable(drawable, tintInfo, iArr);
    }
}
