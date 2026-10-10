package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.Rect;
import android.graphics.RectF;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p126ml.autocapture.C33310d;
import com.sumsub.sns.internal.p126ml.docdetector.C33350a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30518a {

    /* JADX INFO: renamed from: a */
    public final C33310d f61629a;

    /* JADX INFO: renamed from: b */
    public final boolean f61630b = true;

    /* JADX INFO: renamed from: c */
    public boolean f61631c;

    public C30518a(C33310d c33310d) {
        this.f61629a = c33310d;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX INFO: renamed from: a */
    public final C30536d m70404a(float f11, float f12, Rect rect, C33350a c33350a) {
        boolean z11;
        boolean z12;
        CheckDetectionResult$SizeCheckResult checkDetectionResult$SizeCheckResult;
        boolean zContains = rect.contains(AbstractC30566i.m70408a(c33350a.m71661a(), f11, f12));
        if (zContains && !this.f61631c) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "Documents hits the frame", null);
        }
        if (!zContains && this.f61631c) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "Documents is NOT in the frame", null);
        }
        this.f61631c = zContains;
        Rect rectM70408a = AbstractC30566i.m70408a(c33350a.m71661a(), f11, f12);
        float fHeight = (rectM70408a.height() * rectM70408a.width()) / (rect.height() * rect.width());
        C33310d c33310d = this.f61629a;
        boolean z13 = fHeight >= (this.f61630b ? c33310d.f67917f : c33310d.f67916e);
        RectF rectF = new RectF(rectM70408a);
        RectF rectF2 = new RectF(rect);
        if (rectF.width() < rectF2.width()) {
            float fCoerceAtMost = 1.0f - RangesKt.coerceAtMost(rectF.width() / rectF2.width(), 1.0f);
            C33310d c33310d2 = this.f61629a;
            if (fCoerceAtMost <= (this.f61630b ? c33310d2.f67919h : c33310d2.f67918g)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (rectF.width() >= rectF2.width() || rectF.height() <= rectF2.height()) {
            if (rectF.height() < rectF2.height()) {
                float fCoerceAtMost2 = RangesKt.coerceAtMost(1.0f - (rectF.height() / rectF2.height()), 1.0f);
                C33310d c33310d3 = this.f61629a;
                if (fCoerceAtMost2 <= (this.f61630b ? c33310d3.f67919h : c33310d3.f67918g)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            if (rectM70408a.height() > rectM70408a.width()) {
                z11 = z12;
            }
            if (rectF.height() >= rectF2.height() || rectF.width() <= rectF2.width()) {
                checkDetectionResult$SizeCheckResult = (z13 && z11) ? CheckDetectionResult$SizeCheckResult.OK : null;
                if (checkDetectionResult$SizeCheckResult == null) {
                    checkDetectionResult$SizeCheckResult = CheckDetectionResult$SizeCheckResult.SMALL;
                }
            } else {
                checkDetectionResult$SizeCheckResult = CheckDetectionResult$SizeCheckResult.BIG;
            }
        } else {
            checkDetectionResult$SizeCheckResult = CheckDetectionResult$SizeCheckResult.BIG;
        }
        int i11 = c33350a.f67987a;
        int i12 = c33350a.f67989c;
        int i13 = c33350a.f67988b;
        int i14 = c33350a.f67990d;
        int i15 = (int) ((i11 - (i12 / 2)) * f11);
        int i16 = (int) ((i13 - (i14 / 2)) * f12);
        Rect rect2 = new Rect(i15, i16, ((int) (i12 * f11)) + i15, ((int) (i14 * f12)) + i16);
        BigDecimal bigDecimal = new BigDecimal(rect2.width() / rect2.height());
        RoundingMode roundingMode = RoundingMode.FLOOR;
        bigDecimal.setScale(2, roundingMode);
        BigDecimal bigDecimal2 = new BigDecimal(this.f61629a.f67920i);
        BigDecimal bigDecimal3 = new BigDecimal(0.2d);
        C30536d c30536d = new C30536d(zContains, checkDetectionResult$SizeCheckResult, bigDecimal.compareTo(bigDecimal2.subtract(bigDecimal2.multiply(bigDecimal3)).setScale(2, roundingMode)) >= 0 && bigDecimal.compareTo(bigDecimal2.add(bigDecimal2.multiply(bigDecimal3)).setScale(2, roundingMode)) <= 0);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "processor result -> " + c30536d, null);
        return c30536d;
    }

    public C30518a(C33310d c33310d, int i11) {
        this.f61629a = c33310d;
    }
}
