package com.kubi.quotefacade.chain.market.sectors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: ChainSectorsVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.sectors.ChainSectorsVM", m90122f = "ChainSectorsVM.kt", m90123i = {0}, m90124l = {47}, m90125m = "fetchHotSectors", m90126n = {"isLoopQuery"}, m90127s = {"Z$0"})
public final class ChainSectorsVM$fetchHotSectors$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChainSectorsVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainSectorsVM$fetchHotSectors$1(ChainSectorsVM chainSectorsVM, Continuation<? super ChainSectorsVM$fetchHotSectors$1> continuation) {
        super(continuation);
        this.this$0 = chainSectorsVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m51010h(false, this);
    }
}
