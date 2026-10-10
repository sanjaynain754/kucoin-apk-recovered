package p551q7;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

/* JADX INFO: renamed from: q7.a */
/* JADX INFO: compiled from: JsonSchema.java */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated
public class C43651a {

    /* JADX INFO: renamed from: a */
    public final ObjectNode f96326a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C43651a)) {
            return false;
        }
        C43651a c43651a = (C43651a) obj;
        ObjectNode objectNode = this.f96326a;
        if (objectNode == null) {
            return c43651a.f96326a == null;
        }
        return objectNode.equals(c43651a.f96326a);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6391f m96066a() {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", "any");
        return objectNode;
    }

    public int hashCode() {
        return this.f96326a.hashCode();
    }

    public String toString() {
        return this.f96326a.toString();
    }

    @JsonCreator
    public C43651a(ObjectNode objectNode) {
        this.f96326a = objectNode;
    }
}
