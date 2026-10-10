package com.kubi.core.biz.banner;

import com.kubi.core.spot.entity.SpotBannerEntity;
import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.core.spot.entity.SpotBannerPushEntity;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BannerViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1", m90122f = "BannerViewModel.kt", m90123i = {0, 0}, m90124l = {101}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$i$a$-runCatching-BannerViewModel$subscribeBannerData$1$1"}, m90127s = {"L$0", "I$0"})
public final class BannerViewModel$subscribeBannerData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerViewModel$subscribeBannerData$1(BannerViewModel bannerViewModel, String str, Continuation<? super BannerViewModel$subscribeBannerData$1> continuation) {
        super(2, continuation);
        this.this$0 = bannerViewModel;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BannerViewModel$subscribeBannerData$1 bannerViewModel$subscribeBannerData$1 = new BannerViewModel$subscribeBannerData$1(this.this$0, this.$symbol, continuation);
        bannerViewModel$subscribeBannerData$1.L$0 = obj;
        return bannerViewModel$subscribeBannerData$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BannerViewModel$subscribeBannerData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                final BannerViewModel bannerViewModel = this.this$0;
                final String str = this.$symbol;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(bannerViewModel.m21265E().m21297a("/delivery/block"), new BannerViewModel$subscribeBannerData$1$1$1(null));
                InterfaceC41635f interfaceC41635f = new InterfaceC41635f() { // from class: com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1$1$2

                    /* JADX INFO: renamed from: com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1$1$2$1 */
                    /* JADX INFO: compiled from: BannerViewModel.kt */
                    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/spot/entity/SpotBannerEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1$1$2$1", m90122f = "BannerViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
                    @SourceDebugExtension({"SMAP\nBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerViewModel.kt\ncom/kubi/core/biz/banner/BannerViewModel$subscribeBannerData$1$1$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n774#2:126\n865#2,2:127\n774#2:129\n865#2,2:130\n*S KotlinDebug\n*F\n+ 1 BannerViewModel.kt\ncom/kubi/core/biz/banner/BannerViewModel$subscribeBannerData$1$1$2$1\n*L\n105#1:126\n105#1:127,2\n106#1:129\n106#1:130,2\n*E\n"})
                    public static final class C116851 extends SuspendLambda implements Function2<SpotBannerEntity, Continuation<? super Unit>, Object> {
                        /* synthetic */ Object L$0;
                        int label;
                        final /* synthetic */ BannerViewModel this$0;

                        @Override // p852kotlin.jvm.functions.Function2
                        public final Object invoke(SpotBannerEntity spotBannerEntity, Continuation<? super Unit> continuation) {
                            return ((C116851) create(spotBannerEntity, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C116851(BannerViewModel bannerViewModel, Continuation<? super C116851> continuation) {
                            super(2, continuation);
                            this.this$0 = bannerViewModel;
                        }

                        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C116851 c116851 = new C116851(this.this$0, continuation);
                            c116851.L$0 = obj;
                            return c116851;
                        }

                        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            final SpotBannerEntity spotBannerEntity = (SpotBannerEntity) this.L$0;
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.this$0.updateState(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: INVOKE 
                                  (wrap com.kubi.core.biz.banner.BannerViewModel:0x000e: IGET (r2v0 'this' com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1$1$2$1 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:16) com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1$1$2.1.this$0 com.kubi.core.biz.banner.BannerViewModel)
                                  (wrap kotlin.jvm.functions.Function1:0x0012: CONSTRUCTOR (r0v1 'spotBannerEntity' com.kubi.core.spot.entity.SpotBannerEntity A[DONT_INLINE]) A[MD:(com.kubi.core.spot.entity.SpotBannerEntity):void (m), WRAPPED] (LINE:21) call: com.kubi.core.biz.banner.i.<init>(com.kubi.core.spot.entity.SpotBannerEntity):void type: CONSTRUCTOR)
                                 VIRTUAL call: com.kubi.mvi.state.BaseStateVM.updateState(kotlin.jvm.functions.Function1):boolean A[MD:(kotlin.jvm.functions.Function1<? super S extends com.kubi.mvi.state.f, ? extends S extends com.kubi.mvi.state.f>):boolean (m)] (LINE:3) in method: com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1$1$2.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes8.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.kubi.core.biz.banner.i, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 19 more
                                */
                            /*
                                this = this;
                                java.lang.Object r0 = r2.L$0
                                com.kubi.core.spot.entity.SpotBannerEntity r0 = (com.kubi.core.spot.entity.SpotBannerEntity) r0
                                p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r1 = r2.label
                                if (r1 != 0) goto L25
                                p852kotlin.ResultKt.throwOnFailure(r3)
                                com.kubi.core.biz.banner.BannerViewModel r3 = r2.this$0
                                com.kubi.core.biz.banner.i r1 = new com.kubi.core.biz.banner.i
                                r1.<init>(r0)
                                com.kubi.core.biz.banner.BannerViewModel.m21259y(r3, r1)
                                com.kubi.core.biz.banner.BannerViewModel r3 = r2.this$0
                                com.kubi.core.biz.banner.j r1 = new com.kubi.core.biz.banner.j
                                r1.<init>(r0, r3)
                                com.kubi.core.biz.banner.BannerViewModel.m21259y(r3, r1)
                                kotlin.Unit r3 = p852kotlin.Unit.INSTANCE
                                return r3
                            L25:
                                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r3.<init>(r0)
                                throw r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1$1$2.C116851.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        /* JADX INFO: renamed from: g */
                        public static final SpotBannerUiState m21279g(SpotBannerEntity spotBannerEntity, SpotBannerUiState spotBannerUiState) {
                            ArrayList arrayList;
                            String id2;
                            List<SpotBannerItemEntity> list = spotBannerEntity.getList();
                            if (list != null) {
                                arrayList = new ArrayList();
                                for (T t11 : list) {
                                    SpotBannerItemEntity spotBannerItemEntity = (SpotBannerItemEntity) t11;
                                    if (spotBannerItemEntity.getNoticeType() == 3 && (id2 = spotBannerItemEntity.getId()) != null && C11711r.m21307c(id2)) {
                                        arrayList.add(t11);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            return SpotBannerUiState.copy$default(spotBannerUiState, null, arrayList, 1, null);
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX INFO: renamed from: h */
                        public static final SpotBannerUiState m21280h(SpotBannerEntity spotBannerEntity, BannerViewModel bannerViewModel, SpotBannerUiState spotBannerUiState) {
                            ArrayList arrayList;
                            List<SpotBannerItemEntity> complianceNoticeList;
                            List<SpotBannerItemEntity> list = spotBannerEntity.getList();
                            if (list != null) {
                                arrayList = new ArrayList();
                                for (T t11 : list) {
                                    if (((SpotBannerItemEntity) t11).getNoticeType() == 1 && ((complianceNoticeList = ((SpotBannerUiState) bannerViewModel.getState()).getComplianceNoticeList()) == null || complianceNoticeList.isEmpty())) {
                                        arrayList.add(t11);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            return SpotBannerUiState.copy$default(spotBannerUiState, arrayList, null, 2, null);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object emit(SpotBannerPushEntity spotBannerPushEntity, Continuation<? super Unit> continuation) {
                        if (!C41713n0.m91132h(interfaceC41709m0)) {
                            return Unit.INSTANCE;
                        }
                        if (!Intrinsics.areEqual(spotBannerPushEntity.getType(), "noticeUpdate")) {
                            return Unit.INSTANCE;
                        }
                        Object objM42823d = RetrofitFlowExKt.m42823d(bannerViewModel.m21264D(str), false, new C116851(bannerViewModel, null), continuation);
                        return objM42823d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM42823d : Unit.INSTANCE;
                    }
                };
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC41634eM90917h.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }
}
