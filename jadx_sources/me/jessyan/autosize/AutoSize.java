package me.jessyan.autosize;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me.jessyan.autosize.external.ExternalAdaptInfo;
import me.jessyan.autosize.internal.CustomAdapt;
import me.jessyan.autosize.unit.Subunits;
import me.jessyan.autosize.utils.LogUtils;
import me.jessyan.autosize.utils.Preconditions;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoSize {
    private static Map<String, DisplayMetricsInfo> mCache = new ConcurrentHashMap();

    public static void autoConvertDensityBaseOnHeight(Activity activity, float f11) {
        autoConvertDensity(activity, f11, false);
    }

    public static void autoConvertDensityBaseOnWidth(Activity activity, float f11) {
        autoConvertDensity(activity, f11, true);
    }

    private static void setDensity(Activity activity, float f11, int i11, float f12, float f13) {
        DisplayMetrics metricsOnMiui = getMetricsOnMiui(activity.getResources());
        DisplayMetrics metricsOnMiui2 = getMetricsOnMiui(AutoSizeConfig.getInstance().getApplication().getResources());
        if (metricsOnMiui != null) {
            setDensity(metricsOnMiui, f11, i11, f12, f13);
        } else {
            setDensity(activity.getResources().getDisplayMetrics(), f11, i11, f12, f13);
        }
        if (metricsOnMiui2 != null) {
            setDensity(metricsOnMiui2, f11, i11, f12, f13);
        } else {
            setDensity(AutoSizeConfig.getInstance().getApplication().getResources().getDisplayMetrics(), f11, i11, f12, f13);
        }
    }

    /* JADX INFO: renamed from: me.jessyan.autosize.AutoSize$1 */
    public static /* synthetic */ class C425221 {
        static final /* synthetic */ int[] $SwitchMap$me$jessyan$autosize$unit$Subunits;

        static {
            int[] iArr = new int[Subunits.values().length];
            $SwitchMap$me$jessyan$autosize$unit$Subunits = iArr;
            try {
                iArr[Subunits.PT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$me$jessyan$autosize$unit$Subunits[Subunits.MM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$me$jessyan$autosize$unit$Subunits[Subunits.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$me$jessyan$autosize$unit$Subunits[Subunits.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void autoConvertDensity(Activity activity, float f11, boolean z11) {
        float density;
        int densityDpi;
        float scaledDensity;
        float xdpi;
        Preconditions.checkNotNull(activity, "activity == null");
        float designWidth = z11 ? AutoSizeConfig.getInstance().getUnitsManager().getDesignWidth() : AutoSizeConfig.getInstance().getUnitsManager().getDesignHeight();
        if (designWidth <= 0.0f) {
            designWidth = f11;
        }
        String str = f11 + "|" + designWidth + "|" + z11 + "|" + AutoSizeConfig.getInstance().isUseDeviceSize() + "|" + AutoSizeConfig.getInstance().getInitScaledDensity() + "|" + (z11 ? AutoSizeConfig.getInstance().getScreenWidth() : AutoSizeConfig.getInstance().getScreenHeight());
        DisplayMetricsInfo displayMetricsInfo = mCache.get(str);
        if (displayMetricsInfo == null) {
            density = ((z11 ? AutoSizeConfig.getInstance().getScreenWidth() : AutoSizeConfig.getInstance().getScreenHeight()) * 1.0f) / f11;
            scaledDensity = (AutoSizeConfig.getInstance().isExcludeFontScale() ? 1.0f : (AutoSizeConfig.getInstance().getInitScaledDensity() * 1.0f) / AutoSizeConfig.getInstance().getInitDensity()) * density;
            densityDpi = (int) (160.0f * density);
            xdpi = ((z11 ? AutoSizeConfig.getInstance().getScreenWidth() : AutoSizeConfig.getInstance().getScreenHeight()) * 1.0f) / designWidth;
            mCache.put(str, new DisplayMetricsInfo(density, densityDpi, scaledDensity, xdpi));
        } else {
            density = displayMetricsInfo.getDensity();
            densityDpi = displayMetricsInfo.getDensityDpi();
            scaledDensity = displayMetricsInfo.getScaledDensity();
            xdpi = displayMetricsInfo.getXdpi();
        }
        setDensity(activity, density, densityDpi, scaledDensity, xdpi);
        LogUtils.m93243d(String.format(Locale.ENGLISH, "The %s has been adapted! \n%s Info: isBaseOnWidth = %s, %s = %f, %s = %f, targetDensity = %f, targetScaledDensity = %f, targetDensityDpi = %d, targetXdpi = %f", activity.getClass().getName(), activity.getClass().getSimpleName(), Boolean.valueOf(z11), z11 ? "designWidthInDp" : "designHeightInDp", Float.valueOf(f11), z11 ? "designWidthInSubunits" : "designHeightInSubunits", Float.valueOf(designWidth), Float.valueOf(density), Float.valueOf(scaledDensity), Integer.valueOf(densityDpi), Float.valueOf(xdpi)));
    }

    public static void autoConvertDensityOfCustomAdapt(Activity activity, CustomAdapt customAdapt) {
        Preconditions.checkNotNull(customAdapt, "customAdapt == null");
        float sizeInDp = customAdapt.getSizeInDp();
        if (sizeInDp <= 0.0f) {
            sizeInDp = customAdapt.isBaseOnWidth() ? AutoSizeConfig.getInstance().getDesignWidthInDp() : AutoSizeConfig.getInstance().getDesignHeightInDp();
        }
        autoConvertDensity(activity, sizeInDp, customAdapt.isBaseOnWidth());
    }

    public static void autoConvertDensityOfExternalAdaptInfo(Activity activity, ExternalAdaptInfo externalAdaptInfo) {
        Preconditions.checkNotNull(externalAdaptInfo, "externalAdaptInfo == null");
        float sizeInDp = externalAdaptInfo.getSizeInDp();
        if (sizeInDp <= 0.0f) {
            sizeInDp = externalAdaptInfo.isBaseOnWidth() ? AutoSizeConfig.getInstance().getDesignWidthInDp() : AutoSizeConfig.getInstance().getDesignHeightInDp();
        }
        autoConvertDensity(activity, sizeInDp, externalAdaptInfo.isBaseOnWidth());
    }

    private AutoSize() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static void autoConvertDensityOfGlobal(Activity activity) {
        if (AutoSizeConfig.getInstance().isBaseOnWidth()) {
            autoConvertDensityBaseOnWidth(activity, AutoSizeConfig.getInstance().getDesignWidthInDp());
        } else {
            autoConvertDensityBaseOnHeight(activity, AutoSizeConfig.getInstance().getDesignHeightInDp());
        }
    }

    public static void cancelAdapt(Activity activity) {
        float f11;
        float initXdpi = AutoSizeConfig.getInstance().getInitXdpi();
        int i11 = C425221.$SwitchMap$me$jessyan$autosize$unit$Subunits[AutoSizeConfig.getInstance().getUnitsManager().getSupportSubunits().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                f11 = 25.4f;
            }
            setDensity(activity, AutoSizeConfig.getInstance().getInitDensity(), AutoSizeConfig.getInstance().getInitDensityDpi(), AutoSizeConfig.getInstance().getInitScaledDensity(), initXdpi);
        }
        f11 = 72.0f;
        initXdpi /= f11;
        setDensity(activity, AutoSizeConfig.getInstance().getInitDensity(), AutoSizeConfig.getInstance().getInitDensityDpi(), AutoSizeConfig.getInstance().getInitScaledDensity(), initXdpi);
    }

    private static DisplayMetrics getMetricsOnMiui(Resources resources) {
        if (AutoSizeConfig.getInstance().isMiui() && AutoSizeConfig.getInstance().getTmpMetricsField() != null) {
            try {
                return (DisplayMetrics) AutoSizeConfig.getInstance().getTmpMetricsField().get(resources);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void initCompatMultiProcess(Context context) {
        context.getContentResolver().query(Uri.parse("content://" + context.getPackageName() + ".autosize-init-provider"), null, null, null, null);
    }

    private static void setDensity(DisplayMetrics displayMetrics, float f11, int i11, float f12, float f13) {
        if (AutoSizeConfig.getInstance().getUnitsManager().isSupportDP()) {
            displayMetrics.density = f11;
            displayMetrics.densityDpi = i11;
        }
        if (AutoSizeConfig.getInstance().getUnitsManager().isSupportSP()) {
            displayMetrics.scaledDensity = f12;
        }
        int i12 = C425221.$SwitchMap$me$jessyan$autosize$unit$Subunits[AutoSizeConfig.getInstance().getUnitsManager().getSupportSubunits().ordinal()];
        if (i12 == 1) {
            displayMetrics.xdpi = f13 * 72.0f;
        } else if (i12 == 2) {
            displayMetrics.xdpi = f13 * 25.4f;
        } else {
            if (i12 != 4) {
                return;
            }
            displayMetrics.xdpi = f13;
        }
    }
}
