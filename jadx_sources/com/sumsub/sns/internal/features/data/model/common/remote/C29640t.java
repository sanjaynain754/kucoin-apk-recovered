package com.sumsub.sns.internal.features.data.model.common.remote;

import java.util.List;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.json.C41910a;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;
import xg0.AbstractC46162a;
import xg0.InterfaceC46172g;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29640t implements InterfaceC44951d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC44951d f59696a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC45533f f59697b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        InterfaceC29434p c29427o = null;
        InterfaceC46172g interfaceC46172g = interfaceC41787b instanceof InterfaceC46172g ? (InterfaceC46172g) interfaceC41787b : null;
        if (interfaceC46172g == null) {
            throw new IllegalStateException("FieldResponseSerializer requires JsonDecoder");
        }
        C29633s c29633s = (C29633s) this.f59696a.deserialize(interfaceC41787b);
        JsonElement jsonElement = c29633s.f59690e;
        if (jsonElement != null && !Intrinsics.areEqual(jsonElement, C41910a.INSTANCE)) {
            if (jsonElement instanceof JsonPrimitive) {
                c29427o = new C29420n(((JsonPrimitive) jsonElement).mo91789a());
            } else if ((jsonElement instanceof JsonArray) && StringsKt.equals(c29633s.f59687b, "tins", true)) {
                AbstractC46162a json = interfaceC46172g.getJson();
                json.getSerializersModule();
                c29427o = new C29427o((List) json.m101763c(new C41813f(C29275R3.Companion.serializer()), jsonElement));
            }
        }
        return new C29661w(c29633s.f59686a, c29633s.f59687b, c29633s.f59688c, c29633s.f59689d, c29427o);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return this.f59697b;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        throw new SerializationException("Serialization is not supported for FieldRequest");
    }

    public C29640t() {
        InterfaceC44951d<C29633s> interfaceC44951dSerializer = C29633s.Companion.serializer();
        this.f59696a = interfaceC44951dSerializer;
        this.f59697b = interfaceC44951dSerializer.getDescriptor();
    }
}
