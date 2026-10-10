package com.sumsub.sns.internal.features.data.model.common.remote;

import java.util.List;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.json.JsonElement;
import p852kotlin.NoWhenBranchMatchedException;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;
import xg0.AbstractC46162a;
import xg0.InterfaceC46183r;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.c4 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29337c4 implements InterfaceC44951d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC44951d f59354a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC45533f f59355b;

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        throw new SerializationException("Deserialization is not supported for UpdatedField");
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return this.f59355b;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C29305X3 c29305x3 = (C29305X3) obj;
        JsonElement jsonElementM101764d = null;
        InterfaceC46183r interfaceC46183r = interfaceC45830c instanceof InterfaceC46183r ? (InterfaceC46183r) interfaceC45830c : null;
        if (interfaceC46183r == null) {
            throw new IllegalStateException("FieldRequestSerializer requires JsonEncoder");
        }
        InterfaceC29434p interfaceC29434p = c29305x3.f59313b;
        if (interfaceC29434p != null) {
            if (interfaceC29434p instanceof C29420n) {
                AbstractC46162a abstractC46162aMo91929a = interfaceC46183r.mo91929a();
                String str = ((C29420n) interfaceC29434p).f59418a;
                abstractC46162aMo91929a.getSerializersModule();
                jsonElementM101764d = abstractC46162aMo91929a.m101764d(C41897w2.f92051a, str);
            } else {
                if (!(interfaceC29434p instanceof C29427o)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC46162a abstractC46162aMo91929a2 = interfaceC46183r.mo91929a();
                List list = ((C29427o) interfaceC29434p).f59426a;
                abstractC46162aMo91929a2.getSerializersModule();
                jsonElementM101764d = abstractC46162aMo91929a2.m101764d(new C41813f(C29275R3.Companion.serializer()), list);
            }
        }
        this.f59354a.serialize(interfaceC45830c, new C29329b4(c29305x3.f59312a, jsonElementM101764d));
    }

    public C29337c4() {
        InterfaceC44951d<C29329b4> interfaceC44951dSerializer = C29329b4.Companion.serializer();
        this.f59354a = interfaceC44951dSerializer;
        this.f59355b = interfaceC44951dSerializer.getDescriptor();
    }
}
