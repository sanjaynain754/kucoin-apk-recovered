package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BundleManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleManager$loadConfig$2", m90122f = "BundleManager.kt", m90123i = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5}, m90124l = {162, 177, 196, 211, 227, 285}, m90125m = "invokeSuspend", m90126n = {"fromRemote", "fromPkgPlatform", "bundleInfo", "lockedUrl", "fromRemote", "fromPkgPlatform", "bundleInfo", "fromRemote", "fromPkgPlatform", "fromRemote", "fromPkgPlatform", "bundleInfo", "fromRemote", "fromPkgPlatform"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nBundleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 4 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 5 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,891:1\n1#2:892\n28#3:893\n28#3:906\n28#3:915\n28#3:923\n28#3:928\n41#4:894\n37#4:895\n30#4:897\n41#4:907\n37#4:908\n30#4:910\n74#4:914\n41#4:916\n37#4:917\n30#4:919\n41#4:920\n37#4:921\n30#4:922\n41#4:924\n37#4:925\n30#4:927\n41#4:929\n37#4:930\n30#4:932\n62#5:896\n62#5:909\n62#5:918\n62#5:926\n62#5:931\n766#6:898\n857#6,2:899\n766#6:901\n857#6,2:902\n766#6:904\n857#6:905\n858#6:911\n288#6,2:912\n*S KotlinDebug\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2\n*L\n248#1:893\n264#1:906\n301#1:915\n304#1:923\n307#1:928\n248#1:894\n248#1:895\n248#1:897\n264#1:907\n264#1:908\n264#1:910\n301#1:914\n301#1:916\n301#1:917\n301#1:919\n301#1:920\n301#1:921\n301#1:922\n304#1:924\n304#1:925\n304#1:927\n307#1:929\n307#1:930\n307#1:932\n248#1:896\n264#1:909\n301#1:918\n304#1:926\n307#1:931\n259#1:898\n259#1:899,2\n260#1:901\n260#1:902,2\n264#1:904\n264#1:905\n264#1:911\n267#1:912,2\n*E\n"})
public final class BundleManager$loadConfig$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super LoadBundleConfig>, Object> {
    final /* synthetic */ String $biz;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $entry;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: Code duplicated, block: B:148:0x063c  */
    /* JADX WARN: Code duplicated, block: B:150:0x064d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0659  */
    /* JADX WARN: Code duplicated, block: B:158:0x066b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0702  */
    /* JADX WARN: Code duplicated, block: B:162:0x0708  */
    /* JADX WARN: Code duplicated, block: B:163:0x079a  */
    /* JADX WARN: Code duplicated, block: B:165:0x079d  */
    /* JADX WARN: Code duplicated, block: B:167:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:169:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:170:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:172:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:174:0x0845  */
    /* JADX WARN: Code duplicated, block: B:175:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:177:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:178:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:17:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:181:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:182:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:184:0x08eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:187:0x092b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0934  */
    /* JADX WARN: Code duplicated, block: B:193:0x095f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0964  */
    /* JADX WARN: Code duplicated, block: B:197:0x0977  */
    /* JADX WARN: Code duplicated, block: B:19:0x0102  */
    /* JADX WARN: Code duplicated, block: B:202:0x0986  */
    /* JADX WARN: Code duplicated, block: B:205:0x0999  */
    /* JADX WARN: Code duplicated, block: B:208:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:211:0x09ac  */
    /* JADX WARN: Code duplicated, block: B:212:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:216:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:218:0x0a00 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0135  */
    /* JADX WARN: Code duplicated, block: B:25:0x016f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0175  */
    /* JADX WARN: Code duplicated, block: B:30:0x0192  */
    /* JADX WARN: Code duplicated, block: B:32:0x0195  */
    /* JADX WARN: Code duplicated, block: B:34:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:40:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x0229  */
    /* JADX WARN: Code duplicated, block: B:48:0x0238  */
    /* JADX WARN: Code duplicated, block: B:50:0x023b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0241  */
    /* JADX WARN: Code duplicated, block: B:53:0x027d  */
    /* JADX WARN: Code duplicated, block: B:57:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x02be  */
    /* JADX WARN: Code duplicated, block: B:61:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:63:0x02db  */
    /* JADX WARN: Code duplicated, block: B:66:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:68:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:70:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x0330  */
    /* JADX WARN: Code duplicated, block: B:76:0x033a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0340  */
    /* JADX WARN: Code duplicated, block: B:81:0x035d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0360  */
    /* JADX WARN: Code duplicated, block: B:85:0x0370  */
    /* JADX WARN: Code duplicated, block: B:87:0x037a  */
    /* JADX WARN: Code duplicated, block: B:88:0x037c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0390  */
    /* JADX WARN: Code duplicated, block: B:91:0x0395  */
    /* JADX WARN: Code duplicated, block: B:93:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:96:0x043c  */
    /* JADX WARN: Code duplicated, block: B:98:0x043f  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v31 java.lang.Object, still in use, count: 2, list:
          (r2v31 java.lang.Object) from 0x05b3: PHI (r2 I:??) = (r2v29 java.lang.Object), (r2v31 java.lang.Object) binds: [B:132:0x05b2, B:233:0x05b3] A[DONT_GENERATE, DONT_INLINE]
          (r2v31 java.lang.Object) from 0x0597: CHECK_CAST (com.kubi.sdk.pkg.bundle.BundleInfo) (r2v31 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 2590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.sdk.pkg.bundle.BundleManager$loadConfig$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleManager$loadConfig$2(Context context, String str, String str2, Continuation<? super BundleManager$loadConfig$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$biz = str;
        this.$entry = str2;
    }

    /* JADX INFO: renamed from: f */
    public static final int m57492f(BundleInfo bundleInfo, BundleInfo bundleInfo2) {
        return BundleInfo.INSTANCE.compareBundleVersion$Package_release(bundleInfo.getVersion(), bundleInfo2.getVersion());
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BundleManager$loadConfig$2(this.$context, this.$biz, this.$entry, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super LoadBundleConfig> continuation) {
        return ((BundleManager$loadConfig$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
