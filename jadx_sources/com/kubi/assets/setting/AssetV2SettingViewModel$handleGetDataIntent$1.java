package com.kubi.assets.setting;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetV2SettingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.setting.AssetV2SettingViewModel", m90122f = "AssetV2SettingViewModel.kt", m90123i = {0, 0}, m90124l = {150}, m90125m = "handleGetDataIntent", m90126n = {"intent", "dataList"}, m90127s = {"L$0", "L$1"})
public final class AssetV2SettingViewModel$handleGetDataIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetV2SettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2SettingViewModel$handleGetDataIntent$1(AssetV2SettingViewModel assetV2SettingViewModel, Continuation<? super AssetV2SettingViewModel$handleGetDataIntent$1> continuation) {
        super(continuation);
        this.this$0 = assetV2SettingViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m19270R(null, this);
    }
}
