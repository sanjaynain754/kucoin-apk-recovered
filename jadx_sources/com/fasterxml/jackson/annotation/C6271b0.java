package com.fasterxml.jackson.annotation;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.fasterxml.jackson.annotation.b0 */
/* JADX INFO: compiled from: SimpleObjectIdResolver.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6271b0 implements InterfaceC6269a0 {

    /* JADX INFO: renamed from: a */
    public Map<ObjectIdGenerator.IdKey, Object> f10012a;

    @Override // com.fasterxml.jackson.annotation.InterfaceC6269a0
    /* JADX INFO: renamed from: a */
    public void mo10778a(ObjectIdGenerator.IdKey idKey, Object obj) {
        Map<ObjectIdGenerator.IdKey, Object> map = this.f10012a;
        if (map == null) {
            this.f10012a = new HashMap();
        } else {
            Object obj2 = map.get(idKey);
            if (obj2 != null) {
                if (obj2 == obj) {
                    return;
                }
                throw new IllegalStateException("Already had POJO for id (" + idKey.key.getClass().getName() + ") [" + idKey + "]");
            }
        }
        this.f10012a.put(idKey, obj);
    }

    @Override // com.fasterxml.jackson.annotation.InterfaceC6269a0
    /* JADX INFO: renamed from: b */
    public Object mo10779b(ObjectIdGenerator.IdKey idKey) {
        Map<ObjectIdGenerator.IdKey, Object> map = this.f10012a;
        if (map == null) {
            return null;
        }
        return map.get(idKey);
    }

    @Override // com.fasterxml.jackson.annotation.InterfaceC6269a0
    /* JADX INFO: renamed from: c */
    public InterfaceC6269a0 mo10780c(Object obj) {
        return new C6271b0();
    }

    @Override // com.fasterxml.jackson.annotation.InterfaceC6269a0
    /* JADX INFO: renamed from: d */
    public boolean mo10781d(InterfaceC6269a0 interfaceC6269a0) {
        if (interfaceC6269a0.getClass() == getClass()) {
            return true;
        }
        return false;
    }
}
