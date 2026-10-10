package com.kubi.core.biz.kline;

import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.core.biz.kline.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KLineStorageId.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/kline/KLineStorageId;", "", "<init>", "()V", "getNftKey", "", "code", "hasAutoExpandNtfView", "", "symbolCode", "markHadShowNtfView", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineStorageId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineStorageId.kt\ncom/kubi/core/biz/kline/KLineStorageId\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,49:1\n136#2:50\n126#2,2:51\n*S KotlinDebug\n*F\n+ 1 KLineStorageId.kt\ncom/kubi/core/biz/kline/KLineStorageId\n*L\n33#1:50\n46#1:51,2\n*E\n"})
public final class KLineStorageId {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KLineStorageId f20422a = new KLineStorageId();

    /* JADX INFO: renamed from: b */
    public final boolean m21801b(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return C46392a.m102322d(new StorageId("SPOT_CORE_TRADE_SHARE_CATEGORY", m21800a(str), StorageType.LocalSite, false, 8, null), false);
    }

    /* JADX INFO: renamed from: a */
    public final String m21800a(String str) {
        return "nft-" + str;
    }

    /* JADX INFO: renamed from: c */
    public final void m21802c(@Nullable String str) {
        if (str == null) {
            return;
        }
        C46392a.m102328k(new StorageId("SPOT_CORE_TRADE_SHARE_CATEGORY", m21800a(str), StorageType.LocalSite, false, 8, null), true);
    }
}
