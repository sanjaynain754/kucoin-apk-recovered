package gb;

import android.annotation.SuppressLint;
import com.kubi.assets.R$color;
import com.kubi.assets.R$mipmap;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.utils.extensions.DowngradeExKt;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: gb.a */
/* JADX INFO: compiled from: BaseMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0003¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/BaseMapper;", "", "<init>", "()V", "getCardBackground", "", "rate", "", "getUpGreenBackground", "rateAsDouble", "", "getUpBackground", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class C37858a {
    /* JADX INFO: renamed from: a */
    public final int m85434a(@Nullable String str) {
        double dM66538h = DowngradeExKt.m66538h(str, 0.0d, 1, null);
        return DayNightThemeManager.f28592a.m33189n() ? m85436c(dM66538h) : m85435b(dM66538h);
    }

    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: b */
    public final int m85435b(double d11) {
        if (d11 == 0.0d) {
            return R$color.c_transparent;
        }
        if (0.0d <= d11 && d11 <= 0.2d) {
            return R$mipmap.asset_bg_ongoing_red_1;
        }
        if (0.2d <= d11 && d11 <= 0.4d) {
            return R$mipmap.asset_bg_ongoing_red_2;
        }
        if (0.4d <= d11 && d11 <= 0.6d) {
            return R$mipmap.asset_bg_ongoing_red_3;
        }
        if (0.6d <= d11 && d11 <= 0.8d) {
            return R$mipmap.asset_bg_ongoing_red_4;
        }
        if (0.8d <= d11 && d11 <= 1.0d) {
            return R$mipmap.asset_bg_ongoing_red_5;
        }
        if (d11 > 1.0d) {
            return R$mipmap.asset_bg_ongoing_red_6;
        }
        if (-0.2d <= d11 && d11 <= 0.0d) {
            return R$mipmap.asset_bg_ongoing_green_1;
        }
        if (-0.4d <= d11 && d11 <= -0.2d) {
            return R$mipmap.asset_bg_ongoing_green_2;
        }
        if (-0.6d <= d11 && d11 <= -0.4d) {
            return R$mipmap.asset_bg_ongoing_green_3;
        }
        if (-0.8d <= d11 && d11 <= -0.6d) {
            return R$mipmap.asset_bg_ongoing_green_4;
        }
        if (-1.0d > d11 || d11 > -0.8d) {
            return d11 < -1.0d ? R$mipmap.asset_bg_ongoing_green_6 : R$color.c_transparent;
        }
        return R$mipmap.asset_bg_ongoing_green_5;
    }

    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: c */
    public final int m85436c(double d11) {
        if (d11 == 0.0d) {
            return R$color.c_transparent;
        }
        if (0.0d <= d11 && d11 <= 0.2d) {
            return R$mipmap.asset_bg_ongoing_green_1;
        }
        if (0.2d <= d11 && d11 <= 0.4d) {
            return R$mipmap.asset_bg_ongoing_green_2;
        }
        if (0.4d <= d11 && d11 <= 0.6d) {
            return R$mipmap.asset_bg_ongoing_green_3;
        }
        if (0.6d <= d11 && d11 <= 0.8d) {
            return R$mipmap.asset_bg_ongoing_green_4;
        }
        if (0.8d <= d11 && d11 <= 1.0d) {
            return R$mipmap.asset_bg_ongoing_green_5;
        }
        if (d11 > 1.0d) {
            return R$mipmap.asset_bg_ongoing_green_6;
        }
        if (-0.2d <= d11 && d11 <= 0.0d) {
            return R$mipmap.asset_bg_ongoing_red_1;
        }
        if (-0.4d <= d11 && d11 <= -0.2d) {
            return R$mipmap.asset_bg_ongoing_red_2;
        }
        if (-0.6d <= d11 && d11 <= -0.4d) {
            return R$mipmap.asset_bg_ongoing_red_3;
        }
        if (-0.8d <= d11 && d11 <= -0.6d) {
            return R$mipmap.asset_bg_ongoing_red_4;
        }
        if (-1.0d > d11 || d11 > -0.8d) {
            return d11 < -1.0d ? R$mipmap.asset_bg_ongoing_red_6 : R$color.c_transparent;
        }
        return R$mipmap.asset_bg_ongoing_red_5;
    }
}
