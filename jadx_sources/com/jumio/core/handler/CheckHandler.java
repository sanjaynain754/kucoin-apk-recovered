package com.jumio.core.handler;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RelativeLayout;
import com.jumio.commons.log.Log;
import com.jumio.core.views.CheckView;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jumio.core.C40731t3;
import jumio.core.InterfaceC40668h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH ¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u000eJ\u001a\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020\u000e2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030\u0012J\r\u0010(\u001a\u00020!H\u0000¢\u0006\u0002\b)J\r\u0010*\u001a\u00020!H\u0000¢\u0006\u0002\b+J\u001d\u0010,\u001a\u00020!2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000fH\u0000¢\u0006\u0002\b.R\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006/"}, m90084d2 = {"Lcom/jumio/core/handler/CheckHandler;", "I", "Lcom/jumio/core/interfaces/CheckInterface;", "", "<init>", "()V", "checkInterface", "getCheckInterface", "()Lcom/jumio/core/interfaces/CheckInterface;", "setCheckInterface", "(Lcom/jumio/core/interfaces/CheckInterface;)V", "Lcom/jumio/core/interfaces/CheckInterface;", "bitmapList", "", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "Landroid/graphics/Bitmap;", "viewList", "", "Lcom/jumio/core/views/CheckView;", "parts", "", "getParts", "()Ljava/util/List;", "biggestBitmapRatio", "", "getBiggestBitmapRatio", "()F", "isValidForScanStep", "", "scanStep", "Lcom/jumio/sdk/enums/JumioScanStep;", "isValidForScanStep$jumio_core_release", "attach", "", "scanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "hasPart", "credentialPart", "renderPart", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "detach", "detach$jumio_core_release", "clear", "clear$jumio_core_release", "addBitmap", "bitmap", "addBitmap$jumio_core_release", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCheckHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckHandler.kt\ncom/jumio/core/handler/CheckHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,116:1\n1#2:117\n1863#3,2:118\n216#4,2:120\n*S KotlinDebug\n*F\n+ 1 CheckHandler.kt\ncom/jumio/core/handler/CheckHandler\n*L\n98#1:118,2\n101#1:120,2\n*E\n"})
public abstract class CheckHandler<I extends InterfaceC40668h0> {

    /* JADX INFO: renamed from: a */
    public InterfaceC40668h0 f14150a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f14151b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f14152c = new ArrayList();

    public abstract boolean isValidForScanStep$jumio_core_release(@Nullable JumioScanStep scanStep);

    public final void addBitmap$jumio_core_release(@NotNull JumioCredentialPart credentialPart, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f14151b.put(credentialPart, bitmap);
    }

    public final void attach(@NotNull JumioScanPart scanPart) {
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        try {
            Object scanPart$jumio_core_release = scanPart.getScanPart$jumio_core_release();
            Intrinsics.checkNotNull(scanPart$jumio_core_release, "null cannot be cast to non-null type I of com.jumio.core.handler.CheckHandler");
            InterfaceC40668h0 interfaceC40668h0 = (InterfaceC40668h0) scanPart$jumio_core_release;
            this.f14150a = interfaceC40668h0;
            if (interfaceC40668h0 != null) {
                interfaceC40668h0.setCheckHandler(this);
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }

    public final void clear$jumio_core_release() {
        Iterator it = this.f14152c.iterator();
        while (it.hasNext()) {
            ((CheckView) it.next()).detach$jumio_core_release();
        }
        Iterator it2 = this.f14151b.entrySet().iterator();
        while (it2.hasNext()) {
            ((Bitmap) ((Map.Entry) it2.next()).getValue()).recycle();
        }
        this.f14151b.clear();
    }

    @Nullable
    public final I getCheckInterface() {
        return (I) this.f14150a;
    }

    @NotNull
    public final List<JumioCredentialPart> getParts() {
        return CollectionsKt.toList(this.f14151b.keySet());
    }

    public final boolean hasPart(@NotNull JumioCredentialPart credentialPart) {
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        return this.f14151b.containsKey(credentialPart);
    }

    public final void renderPart(@NotNull JumioCredentialPart credentialPart, @NotNull CheckView<?> view) {
        Float fValueOf;
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f14151b.containsKey(credentialPart)) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C40731t3 c40731t3 = new C40731t3(context);
            c40731t3.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            Bitmap bitmap = (Bitmap) this.f14151b.get(credentialPart);
            if (bitmap != null) {
                float cornerRadius = view.getF14594a();
                int borderColor = view.getF14595b();
                Iterator it = this.f14151b.values().iterator();
                if (it.hasNext()) {
                    Bitmap bitmap2 = (Bitmap) it.next();
                    float width = bitmap2.getWidth() / bitmap2.getHeight();
                    while (it.hasNext()) {
                        Bitmap bitmap3 = (Bitmap) it.next();
                        width = Math.max(width, bitmap3.getWidth() / bitmap3.getHeight());
                    }
                    fValueOf = Float.valueOf(width);
                } else {
                    fValueOf = null;
                }
                c40731t3.m89267a(bitmap, cornerRadius, borderColor, fValueOf != null ? fValueOf.floatValue() : 1.0f);
            }
            view.addView(c40731t3);
            this.f14152c.add(view);
        }
    }

    public final void setCheckInterface(@Nullable I i11) {
        this.f14150a = i11;
    }

    public final void detach$jumio_core_release() {
        clear$jumio_core_release();
        this.f14150a = null;
    }
}
