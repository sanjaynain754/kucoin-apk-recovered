package io.trtc.tuikit.atomicxcore.impl.gift;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import io.trtc.tuikit.atomicxcore.api.gift.GiftCategory;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.gift.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C39665d implements TUILiveGiftManager.GetGiftListCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39667f f88126a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88127b;

    public C39665d(C39667f c39667f, CompletionHandler completionHandler) {
        this.f88126a = c39667f;
        this.f88127b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager.GetGiftListCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88126a.f88132c;
        String message2 = "Response: refreshUsableGifts failed code=" + error.getValue() + ", message=" + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        CompletionHandler completionHandler = this.f88127b;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager.GetGiftListCallback
    public final void onSuccess(List list) {
        ArrayList arrayList;
        List listFilterNotNull;
        AbstractC39465b.m88232a(this.f88126a.f88132c, "Response: refreshUsableGifts success", "message", 0, "Response: refreshUsableGifts success");
        if (list == null || (listFilterNotNull = CollectionsKt.filterNotNull(list)) == null) {
            arrayList = null;
        } else {
            int i11 = 10;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterNotNull, 10));
            Iterator it = listFilterNotNull.iterator();
            while (it.hasNext()) {
                TUILiveGiftManager.GiftCategory category = (TUILiveGiftManager.GiftCategory) it.next();
                Intrinsics.checkNotNullParameter(category, "category");
                String categoryId = category.categoryId;
                Intrinsics.checkNotNullExpressionValue(categoryId, "categoryId");
                String name = category.name;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                String desc = category.desc;
                Intrinsics.checkNotNullExpressionValue(desc, "desc");
                Map<String, String> extensionInfo = category.extensionInfo;
                Intrinsics.checkNotNullExpressionValue(extensionInfo, "extensionInfo");
                List<TUILiveGiftManager.GiftInfo> giftList = category.giftList;
                Intrinsics.checkNotNullExpressionValue(giftList, "giftList");
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(giftList, i11));
                Iterator it2 = giftList.iterator();
                while (it2.hasNext()) {
                    TUILiveGiftManager.GiftInfo gift = (TUILiveGiftManager.GiftInfo) it2.next();
                    Intrinsics.checkNotNull(gift);
                    Intrinsics.checkNotNullParameter(gift, "gift");
                    String giftId = gift.giftId;
                    Intrinsics.checkNotNullExpressionValue(giftId, "giftId");
                    String name2 = gift.name;
                    Intrinsics.checkNotNullExpressionValue(name2, "name");
                    Iterator it3 = it;
                    String desc2 = gift.desc;
                    Intrinsics.checkNotNullExpressionValue(desc2, "desc");
                    String iconUrl = gift.iconUrl;
                    Intrinsics.checkNotNullExpressionValue(iconUrl, "iconUrl");
                    String resourceUrl = gift.resourceUrl;
                    Intrinsics.checkNotNullExpressionValue(resourceUrl, "resourceUrl");
                    long j11 = gift.level;
                    long j12 = gift.coins;
                    Map<String, String> extensionInfo2 = gift.extensionInfo;
                    Intrinsics.checkNotNullExpressionValue(extensionInfo2, "extensionInfo");
                    arrayList2.add(new Gift(giftId, name2, desc2, iconUrl, resourceUrl, j11, j12, extensionInfo2));
                    it2 = it2;
                    it = it3;
                }
                arrayList.add(new GiftCategory(categoryId, name, desc, extensionInfo, arrayList2));
                i11 = 10;
            }
        }
        InterfaceC41669n interfaceC41669n = this.f88126a.f88131b;
        List listEmptyList = arrayList;
        if (arrayList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        interfaceC41669n.setValue(listEmptyList);
        CompletionHandler completionHandler = this.f88127b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
