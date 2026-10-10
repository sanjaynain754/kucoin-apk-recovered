package com.kubi.kucoin.home.p090v2.cards;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BaseStateCardV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/IState;", "Lcom/kubi/kucoin/home/v2/cards/BaseStateCardV2;", "Lcom/kubi/mvi/state/IIntent;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "<init>", "()V", "needCatchUIException", "", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SimpleStateCardV2<S extends InterfaceC19284f> extends BaseStateCardV2<InterfaceC19282d, S, AbstractC19291m<S>> {
    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.mvi.state.InterfaceC19285g
    public boolean needCatchUIException() {
        return true;
    }
}
