package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.log.logger.Logger;
import com.sumsub.sentry.android.C27921i;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.fingerprint.C33061b;
import com.sumsub.sns.internal.fingerprint.C33062c;
import com.sumsub.sns.internal.fingerprint.C33065f;
import com.sumsub.sns.internal.fingerprint.tools.threading.AbstractC33261a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.util.camera.C33392b;
import com.sumsub.sns.internal.util.camera.C33394d;
import com.sumsub.sns.internal.util.camera.XposedVirtualCameraDirectory;
import com.sumsub.sns.internal.util.root.C33411b;
import com.sumsub.sns.internal.util.root.C33413d;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32236q {

    /* JADX INFO: renamed from: a */
    public final C33062c f65676a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29953a f65677b;

    /* JADX INFO: renamed from: c */
    public final C33394d f65678c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71063a(ContinuationImpl continuationImpl) {
        C32234p c32234p;
        if (continuationImpl instanceof C32234p) {
            c32234p = (C32234p) continuationImpl;
            int i11 = c32234p.f65671c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32234p.f65671c = i11 - Integer.MIN_VALUE;
            } else {
                c32234p = new C32234p(this, continuationImpl);
            }
        } else {
            c32234p = new C32234p(this, continuationImpl);
        }
        Object orThrow = c32234p.f65669a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32234p.f65671c;
        boolean z11 = true;
        if (i12 == 0) {
            ResultKt.throwOnFailure(orThrow);
            if (!C33048a.f67445H.m71434a()) {
                Logger.DefaultImpls.d$default(C33272c.f67812a, "Fingerprinter", "Fingerprint is disabled", null, 4, null);
                return null;
            }
            Logger.DefaultImpls.d$default(C33272c.f67812a, "Fingerprinter", "Fingerprint is enabled, collecting...", null, 4, null);
            C33062c c33062c = this.f65676a;
            c32234p.f65671c = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(c32234p));
            C33065f c33065f = new C33065f(safeContinuation);
            c33062c.getClass();
            if (Result.m103847exceptionOrNullimpl(AbstractC33261a.m71612a(new C33061b(c33062c, c33065f, c33065f))) != null) {
                safeContinuation.resumeWith(Result.m103844constructorimpl(MapsKt.emptyMap()));
                Unit unit = Unit.INSTANCE;
            }
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(c32234p);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(orThrow);
        }
        Map mutableMap = MapsKt.toMutableMap((Map) orThrow);
        C27921i c27921i = (C27921i) ((C29957e) this.f65677b).f60161g.f57039f.getValue();
        mutableMap.putAll(AbstractC28458h.m69350b(MapsKt.mapOf(TuplesKt.m90091to("root_sentry_checkTestKeys", Boolean.valueOf(c27921i.f57040a)), TuplesKt.m90091to("root_sentry_checkRootFiles", Boolean.valueOf(c27921i.f57041b)), TuplesKt.m90091to("root_sentry_checkSUExist", Boolean.valueOf(c27921i.f57042c)), TuplesKt.m90091to("root_sentry_checkRootPackages", Boolean.valueOf(c27921i.f57043d)))));
        mutableMap.putAll(AbstractC28458h.m69350b(((C33411b) ((C29957e) this.f65677b).f60160f.f68113a.getValue()).m71697a()));
        C33413d c33413d = (C33413d) ((C29957e) this.f65677b).f60162h.f68123a.getValue();
        Pair pairM90091to = TuplesKt.m90091to("sns_root_checkForBinary", Boolean.valueOf(c33413d.f68124a));
        Pair pairM90091to2 = TuplesKt.m90091to("sns_root_checkForMagiskBinary", Boolean.valueOf(c33413d.f68125b));
        if (!c33413d.f68124a && !c33413d.f68125b) {
            z11 = false;
        }
        mutableMap.putAll(AbstractC28458h.m69350b(MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("sns_root_isRooted", Boolean.valueOf(z11)))));
        C33394d c33394d = this.f65678c;
        c33394d.getClass();
        List listPlus = CollectionsKt.plus((Collection) c33394d.m71685a(XposedVirtualCameraDirectory.INTERNAL), (Iterable) c33394d.m71685a(XposedVirtualCameraDirectory.EXTERNAL));
        Pair pairM90091to3 = TuplesKt.m90091to("xposed_traces", CollectionsKt.joinToString$default(c33394d.f68101b.f68108b, ", ", null, null, 0, null, null, 62, null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listPlus, 10)), 16));
        Iterator it = listPlus.iterator();
        while (it.hasNext()) {
            Pair pairM71684a = ((C33392b) it.next()).m71684a();
            linkedHashMap.put(pairM71684a.getFirst(), pairM71684a.getSecond());
        }
        mutableMap.putAll(AbstractC28458h.m69350b(MapsKt.plus(linkedHashMap, pairM90091to3)));
        mutableMap.put("is_emulator", String.valueOf(((C29957e) this.f65677b).f60159e.m68994a()));
        Logger.DefaultImpls.d$default(C33272c.f67812a, "Fingerprinter", "Fingerprint size: " + mutableMap.size(), null, 4, null);
        return mutableMap;
    }

    public C32236q(C33062c c33062c, InterfaceC29953a interfaceC29953a, C33394d c33394d) {
        this.f65676a = c33062c;
        this.f65677b = interfaceC29953a;
        this.f65678c = c33394d;
    }
}
