package com.jumio.core.extraction;

import android.graphics.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.core.model.StaticModel;
import com.jumio.core.persistence.DataManager;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J.\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u001e\u0010\u001b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cJ\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0012J\u0016\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001dJ\u0006\u0010$\u001a\u00020\u0012J\u0006\u0010%\u001a\u00020\u0012J\u000e\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(J\u0010\u0010)\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u001dR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006,"}, m90084d2 = {"Lcom/jumio/core/extraction/SubExtractionProxy;", "", "<init>", "()V", "subExtraction", "", "Lcom/jumio/core/extraction/ExtractionClient;", "Lcom/jumio/core/extraction/SubExtractionSubscriber;", "value", "", "active", "getActive", "()Z", "setActive", "(Z)V", "areConfigured", "getAreConfigured", "setDataExtraction", "", "setCameraSettings", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "setExtractionArea", "extractionArea", "Landroid/graphics/Rect;", "add", "extractionClient", "mergeResults", "Lkotlin/Function2;", "Lcom/jumio/core/model/StaticModel;", "remove", "reinit", "configure", "dataManager", "Lcom/jumio/core/persistence/DataManager;", "configurationModel", "cancel", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "feed", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", BridgeParamKeyKt.CAPTURE, "mergeResult", "data", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSubExtractionProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubExtractionProxy.kt\ncom/jumio/core/extraction/SubExtractionProxy\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,110:1\n216#2,2:111\n168#2,3:113\n216#2,2:116\n216#2,2:118\n216#2,2:120\n216#2,2:122\n216#2,2:124\n216#2,2:126\n216#2,2:128\n216#2,2:130\n216#2,2:132\n216#2,2:134\n*S KotlinDebug\n*F\n+ 1 SubExtractionProxy.kt\ncom/jumio/core/extraction/SubExtractionProxy\n*L\n17#1:111,2\n26#1:113,3\n28#1:116,2\n31#1:118,2\n33#1:120,2\n47#1:122,2\n50#1:124,2\n52#1:126,2\n54#1:128,2\n61#1:130,2\n69#1:132,2\n74#1:134,2\n*E\n"})
public final class SubExtractionProxy {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f13894a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public boolean f13895b;

    public final void add(@NotNull ExtractionClient extractionClient, @NotNull Function2<? super StaticModel, ? super StaticModel, ? extends StaticModel> mergeResults) {
        Intrinsics.checkNotNullParameter(extractionClient, "extractionClient");
        Intrinsics.checkNotNullParameter(mergeResults, "mergeResults");
        SubExtractionSubscriber subExtractionSubscriber = new SubExtractionSubscriber(mergeResults);
        extractionClient.setSubExtraction(true);
        this.f13894a.put(extractionClient, subExtractionSubscriber);
        extractionClient.subscribe(subExtractionSubscriber);
    }

    public final void cancel() {
        Iterator it = this.f13894a.entrySet().iterator();
        while (it.hasNext()) {
            ((ExtractionClient) ((Map.Entry) it.next()).getKey()).cancel();
        }
    }

    public final void capture(@Nullable Frame frame) {
        if (this.f13895b) {
            Iterator it = this.f13894a.entrySet().iterator();
            while (it.hasNext()) {
                ((ExtractionClient) ((Map.Entry) it.next()).getKey()).capture(frame);
            }
        }
    }

    public final void configure(@NotNull DataManager dataManager, @NotNull StaticModel configurationModel) {
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(configurationModel, "configurationModel");
        Iterator it = this.f13894a.entrySet().iterator();
        while (it.hasNext()) {
            ((ExtractionClient) ((Map.Entry) it.next()).getKey()).configure(dataManager, configurationModel);
        }
    }

    public final void destroy() {
        Iterator it = this.f13894a.entrySet().iterator();
        while (it.hasNext()) {
            ((ExtractionClient) ((Map.Entry) it.next()).getKey()).destroy();
        }
    }

    public final void feed(@NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (this.f13895b) {
            Iterator it = this.f13894a.entrySet().iterator();
            while (it.hasNext()) {
                ((ExtractionClient) ((Map.Entry) it.next()).getKey()).feed(frame);
            }
        }
    }

    /* JADX INFO: renamed from: getActive, reason: from getter */
    public final boolean getF13895b() {
        return this.f13895b;
    }

    public final boolean getAreConfigured() {
        LinkedHashMap linkedHashMap = this.f13894a;
        if (linkedHashMap.isEmpty()) {
            return true;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!((ExtractionClient) ((Map.Entry) it.next()).getKey()).getF13859q()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final StaticModel mergeResult(@Nullable StaticModel data) {
        Iterator it = this.f13894a.entrySet().iterator();
        while (it.hasNext()) {
            SubExtractionSubscriber subExtractionSubscriber = (SubExtractionSubscriber) ((Map.Entry) it.next()).getValue();
            data = (StaticModel) subExtractionSubscriber.f13896a.invoke(data, subExtractionSubscriber.f13897b);
        }
        return data;
    }

    public final void reinit() {
        Iterator it = this.f13894a.entrySet().iterator();
        while (it.hasNext()) {
            ((ExtractionClient) ((Map.Entry) it.next()).getKey()).reinit();
        }
    }

    public final void remove(@NotNull ExtractionClient extractionClient) {
        Intrinsics.checkNotNullParameter(extractionClient, "extractionClient");
        this.f13894a.remove(extractionClient);
    }

    public final void setActive(boolean z11) {
        if (z11 != this.f13895b && !z11) {
            for (Map.Entry entry : this.f13894a.entrySet()) {
                ((SubExtractionSubscriber) entry.getValue()).f13897b = null;
                ((ExtractionClient) entry.getKey()).reinit();
            }
        }
        this.f13895b = z11;
    }

    public final void setCameraSettings(@NotNull CameraSettings cameraSettings) {
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Iterator it = this.f13894a.entrySet().iterator();
        while (it.hasNext()) {
            ((ExtractionClient) ((Map.Entry) it.next()).getKey()).setCameraSettings(cameraSettings);
        }
    }

    public final void setDataExtraction(boolean value) {
        Iterator it = this.f13894a.entrySet().iterator();
        while (it.hasNext()) {
            ((ExtractionClient) ((Map.Entry) it.next()).getKey()).setDataExtraction(value);
        }
    }

    public final void setExtractionArea(@NotNull Rect extractionArea) {
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        Iterator it = this.f13894a.entrySet().iterator();
        while (it.hasNext()) {
            ((ExtractionClient) ((Map.Entry) it.next()).getKey()).setExtractionArea(extractionArea);
        }
    }
}
