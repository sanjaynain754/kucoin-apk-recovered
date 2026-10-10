package af;

import android.os.Looper;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: af.a */
/* JADX INFO: compiled from: ExUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0000¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a$\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\rH\u0086\bø\u0001\u0000\u001a\u001a\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u000fj\b\u0012\u0004\u0012\u00020\u000b`\u0010*\u00020\u0011\u001a\"\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, m90084d2 = {"putValue", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "value", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "visibleOrGone", "Landroid/view/View;", "isShow", "", "isNotEmpty", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "getPrecisionList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", TtmlNode.TAG_DIV, "Ljava/math/BigDecimal;", "other", "scale", "roundingMode", "Ljava/math/RoundingMode;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C0296a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final BigDecimal m1039a(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal other, int i11, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        BigDecimal bigDecimalDivide = bigDecimal.divide(other, i11, roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ArrayList<String> m1040b(int i11) {
        ArrayList<String> arrayList = new ArrayList<>();
        int i12 = i11 > 4 ? 4 : i11;
        for (int i13 = 0; i13 < i12; i13++) {
            BigDecimal bigDecimalPow = new BigDecimal("0.1").pow(i11 - i13);
            Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "pow(...)");
            arrayList.add(C42180b.m92640e(bigDecimalPow, null, 20, false, false, false, 0, null, 125, null));
        }
        if (arrayList.size() < 4) {
            arrayList.add("1");
        }
        if (arrayList.size() < 4) {
            arrayList.add("10");
        }
        if (arrayList.size() < 4) {
            arrayList.add(C33556b3.f68995S);
        }
        if (arrayList.size() < 4) {
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f("1000");
            String strM92640e = bigDecimalM66536f != null ? C42180b.m92640e(bigDecimalM66536f, null, 20, false, false, false, 0, null, 125, null) : null;
            if (strM92640e == null) {
                strM92640e = "";
            }
            arrayList.add(strM92640e);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final <T> void m1041c(@NotNull MutableLiveData<T> mutableLiveData, T t11) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<this>");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            mutableLiveData.setValue(t11);
        } else {
            mutableLiveData.postValue(t11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m1042d(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z11) {
            ViewExtKt.m66594y(view);
        } else {
            ViewExtKt.m66577h(view);
        }
    }
}
