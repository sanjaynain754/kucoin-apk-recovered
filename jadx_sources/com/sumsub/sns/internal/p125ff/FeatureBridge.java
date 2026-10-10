package com.sumsub.sns.internal.p125ff;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Constants;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import com.sumsub.sns.internal.p125ff.core.C33051b;
import com.sumsub.sns.internal.p125ff.core.C33052c;
import com.sumsub.sns.internal.p125ff.core.FeatureFlagValueType;
import com.tencent.bugly.proguard.AbstractC34022xe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0003¨\u0006\u0017"}, m90084d2 = {"Lcom/sumsub/sns/internal/ff/FeatureBridge;", "", "<init>", "()V", "", "Lcom/sumsub/sns/internal/ff/core/a;", "Landroid/os/Bundle;", "serialize", "(Ljava/util/Collection;)Landroid/os/Bundle;", "getLocalFeatures", "()Landroid/os/Bundle;", "getRemoteFeatures", "", "name", "", Constants.ENABLE_DISABLE, "value", "", "overrideFeature", "(Ljava/lang/String;ZLjava/lang/String;)V", "clearOverride", "(Ljava/lang/String;)V", "clear", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFeatureBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureBridge.kt\ncom/sumsub/sns/internal/ff/FeatureBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1869#2,2:54\n*S KotlinDebug\n*F\n+ 1 FeatureBridge.kt\ncom/sumsub/sns/internal/ff/FeatureBridge\n*L\n37#1:54,2\n*E\n"})
public final class FeatureBridge {

    @NotNull
    public static final FeatureBridge INSTANCE = new FeatureBridge();

    private final Bundle serialize(Collection<C33050a> collection) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (C33050a c33050a : collection) {
            Bundle bundle = new Bundle();
            bundle.putCharSequence("name", c33050a.f67494a);
            bundle.putBoolean("local_only", c33050a.f67496c);
            bundle.putCharSequence("human_readable_description", c33050a.f67495b);
            bundle.putBoolean("default_enabled", c33050a.f67500g.f67503a);
            String str = c33050a.f67500g.f67504b;
            if (str != null) {
                bundle.putCharSequence("default_value", str);
            }
            arrayList.add(bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList(AbstractC34022xe.f72514e, arrayList);
        return bundle2;
    }

    public final void clear() {
        C33051b c33051b = C33048a.f67466b;
        Iterator it = c33051b.f67501a.entrySet().iterator();
        while (it.hasNext()) {
            C33050a c33050a = (C33050a) ((Map.Entry) it.next()).getValue();
            c33050a.f67497d.set(null);
            c33050a.f67499f.set(null);
            c33050a.f67498e.set(null);
        }
        Iterator it2 = c33051b.f67502b.entrySet().iterator();
        while (it2.hasNext()) {
            C33050a c33050a2 = (C33050a) ((Map.Entry) it2.next()).getValue();
            c33050a2.f67497d.set(null);
            c33050a2.f67499f.set(null);
            c33050a2.f67498e.set(null);
        }
        C33048a.f67468c.clear();
    }

    public final void clearOverride(@NotNull String name) {
        C33048a.f67468c.remove(name);
        C33051b c33051b = C33048a.f67466b;
        C33050a c33050a = (C33050a) c33051b.f67501a.get(name);
        if (c33050a == null) {
            c33050a = (C33050a) c33051b.f67502b.get(name);
        }
        if (c33050a != null) {
            c33050a.f67499f.set(null);
        }
    }

    @NotNull
    public final Bundle getLocalFeatures() {
        return serialize(C33048a.f67466b.f67502b.values());
    }

    @NotNull
    public final Bundle getRemoteFeatures() {
        return serialize(C33048a.f67466b.f67501a.values());
    }

    public final void overrideFeature(@NotNull String name, boolean isEnabled, @Nullable String value) {
        C33048a.f67468c.put(name, new Pair(Boolean.valueOf(isEnabled), value));
        C33051b c33051b = C33048a.f67466b;
        C33050a c33050a = (C33050a) c33051b.f67501a.get(name);
        if (c33050a == null) {
            c33050a = (C33050a) c33051b.f67502b.get(name);
        }
        if (c33050a != null) {
            AtomicReference atomicReference = c33050a.f67499f;
            FeatureFlagValueType featureFlagValueType = FeatureFlagValueType.DEFAULT;
            atomicReference.set(new C33052c(isEnabled, value));
        }
    }

    private FeatureBridge() {
    }
}
