package com.kubi.operation.lib.cards.welfare;

import android.text.TextUtils;
import com.kubi.kucoin.home.cards.CardInterceptor;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27041f;
import p852kotlin.Metadata;
import us.C45300a;

/* JADX INFO: renamed from: com.kubi.operation.lib.cards.welfare.q, reason: from Kotlin metadata */
/* JADX INFO: compiled from: WelfareCardInterceptor.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\t"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/welfare/WelfareCardInterceptor;", "Lcom/kubi/kucoin/home/cards/CardInterceptor;", "<init>", "()V", "needShowCard", "", "needShowConfig", "needRequestData", "hasInfoButNotLogin", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WelfareCardInterceptor implements CardInterceptor {
    @Override // com.kubi.kucoin.home.cards.CardInterceptor
    /* JADX INFO: renamed from: a */
    public boolean mo29504a() {
        return C45300a.m100160a();
    }

    @Override // com.kubi.kucoin.home.cards.CardInterceptor
    /* JADX INFO: renamed from: b */
    public boolean mo29505b() {
        if (!m43460d() && C45300a.m100160a()) {
            return true;
        }
        return false;
    }

    @Override // com.kubi.kucoin.home.cards.CardInterceptor
    /* JADX INFO: renamed from: c */
    public boolean mo29506c() {
        if (!m43460d() && C45300a.m100160a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m43460d() {
        if (!TextUtils.isEmpty(C27041f.m66668h(UserInfo.c().id)) && !UserInfo.a.n()) {
            return true;
        }
        return false;
    }
}
