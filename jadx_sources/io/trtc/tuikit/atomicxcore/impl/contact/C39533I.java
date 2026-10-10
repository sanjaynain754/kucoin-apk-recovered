package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMFriendInfo;
import com.tencent.imsdk.p128v2.V2TIMFriendshipListener;
import io.trtc.tuikit.atomicxcore.api.contact.ContactInfo;
import io.trtc.tuikit.atomicxcore.api.contact.FriendApplicationInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.I */
/* JADX INFO: loaded from: classes61.dex */
public final class C39533I extends V2TIMFriendshipListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87788a;

    public C39533I(C39539O c39539o) {
        this.f87788a = c39539o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onBlackListAdd(List list) {
        if (list != null) {
            C39539O c39539o = this.f87788a;
            c39539o.getClass();
            ArrayList<ContactInfo> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C39539O.m88275a((V2TIMFriendInfo) it.next()));
            }
            for (ContactInfo contactInfo : arrayList) {
                Iterable iterable = (Iterable) c39539o.f87798a.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    do {
                        if (it2.hasNext()) {
                        }
                    } while (!Intrinsics.areEqual(((ContactInfo) it2.next()).getContactID(), contactInfo.getContactID()));
                }
                InterfaceC41669n interfaceC41669n = c39539o.f87798a;
                interfaceC41669n.setValue(CollectionsKt.plus((Collection<? extends ContactInfo>) interfaceC41669n.getValue(), contactInfo));
            }
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onBlackListDeleted(List list) {
        if (list != null) {
            InterfaceC41669n interfaceC41669n = this.f87788a.f87798a;
            Iterable iterable = (Iterable) interfaceC41669n.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!list.contains(((ContactInfo) obj).getContactID())) {
                    arrayList.add(obj);
                }
            }
            interfaceC41669n.setValue(arrayList);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendApplicationListAdded(List list) {
        if (list != null) {
            C39539O c39539o = this.f87788a;
            ArrayList<FriendApplicationInfo> arrayListM88277a = C39539O.m88277a(c39539o, list);
            List mutableList = CollectionsKt.toMutableList((Collection) c39539o.f87801d.getValue());
            for (FriendApplicationInfo friendApplicationInfo : arrayListM88277a) {
                Iterator it = mutableList.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    } else if (Intrinsics.areEqual(((FriendApplicationInfo) it.next()).getApplicationID(), friendApplicationInfo.getApplicationID())) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    mutableList.set(i11, friendApplicationInfo);
                } else {
                    mutableList.add(friendApplicationInfo);
                }
            }
            c39539o.f87801d.setValue(mutableList);
            c39539o.f87803f.setValue(Integer.valueOf(((List) c39539o.f87801d.getValue()).size()));
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendApplicationListDeleted(List list) {
        if (list != null) {
            C39539O c39539o = this.f87788a;
            InterfaceC41669n interfaceC41669n = c39539o.f87801d;
            Iterable iterable = (Iterable) interfaceC41669n.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!list.contains(((FriendApplicationInfo) obj).getApplicationID())) {
                    arrayList.add(obj);
                }
            }
            interfaceC41669n.setValue(arrayList);
            c39539o.f87803f.setValue(Integer.valueOf(((List) c39539o.f87801d.getValue()).size()));
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendApplicationListRead() {
        this.f87788a.f87803f.setValue(0);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendInfoChanged(List list) {
        Object value;
        ArrayList arrayList;
        InterfaceC41669n interfaceC41669n = this.f87788a.f87799b;
        do {
            value = interfaceC41669n.getValue();
            List<ContactInfo> list2 = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (ContactInfo contactInfoM88275a : list2) {
                V2TIMFriendInfo v2TIMFriendInfo = null;
                Object obj = null;
                if (list != null) {
                    for (Object obj2 : list) {
                        V2TIMFriendInfo v2TIMFriendInfo2 = (V2TIMFriendInfo) obj2;
                        if (Intrinsics.areEqual(v2TIMFriendInfo2 != null ? v2TIMFriendInfo2.getUserID() : null, contactInfoM88275a.getContactID())) {
                            obj = obj2;
                            break;
                        }
                    }
                    v2TIMFriendInfo = (V2TIMFriendInfo) obj;
                }
                if (v2TIMFriendInfo != null) {
                    contactInfoM88275a = C39539O.m88275a(v2TIMFriendInfo);
                    contactInfoM88275a.setContact(Boolean.TRUE);
                }
                arrayList.add(contactInfoM88275a);
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendListAdded(List list) {
        if (list != null) {
            C39539O c39539o = this.f87788a;
            c39539o.getClass();
            ArrayList<ContactInfo> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C39539O.m88275a((V2TIMFriendInfo) it.next()));
            }
            for (ContactInfo contactInfo : arrayList) {
                Iterable iterable = (Iterable) c39539o.f87799b.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    do {
                        if (it2.hasNext()) {
                        }
                    } while (!Intrinsics.areEqual(((ContactInfo) it2.next()).getContactID(), contactInfo.getContactID()));
                }
                InterfaceC41669n interfaceC41669n = c39539o.f87799b;
                interfaceC41669n.setValue(CollectionsKt.plus((Collection<? extends ContactInfo>) interfaceC41669n.getValue(), contactInfo));
            }
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendListDeleted(List list) {
        if (list != null) {
            InterfaceC41669n interfaceC41669n = this.f87788a.f87799b;
            Iterable iterable = (Iterable) interfaceC41669n.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!list.contains(((ContactInfo) obj).getContactID())) {
                    arrayList.add(obj);
                }
            }
            interfaceC41669n.setValue(arrayList);
        }
    }
}
