package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes45.dex */
public class TypeParser implements Serializable {
    private static final long serialVersionUID = 1;
    protected final TypeFactory _factory;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.type.TypeParser$a */
    public static final class C6478a extends StringTokenizer {

        /* JADX INFO: renamed from: a */
        public final String f10695a;

        /* JADX INFO: renamed from: b */
        public int f10696b;

        /* JADX INFO: renamed from: c */
        public String f10697c;

        public C6478a(String str) {
            super(str, "<,>", true);
            this.f10695a = str;
        }

        /* JADX INFO: renamed from: a */
        public String m11856a() {
            return this.f10695a;
        }

        /* JADX INFO: renamed from: b */
        public String m11857b() {
            return this.f10695a.substring(this.f10696b);
        }

        /* JADX INFO: renamed from: c */
        public void m11858c(String str) {
            this.f10697c = str;
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            return this.f10697c != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this.f10697c;
            if (str != null) {
                this.f10697c = null;
                return str;
            }
            String strNextToken = super.nextToken();
            this.f10696b += strNextToken.length();
            return strNextToken.trim();
        }
    }

    public IllegalArgumentException _problem(C6478a c6478a, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", c6478a.m11856a(), c6478a.m11857b(), str));
    }

    public Class<?> findClass(String str, C6478a c6478a) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e11) {
            C6490g.m11943j0(e11);
            throw _problem(c6478a, "Cannot locate class '" + str + "', problem: " + e11.getMessage());
        }
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        C6478a c6478a = new C6478a(str.trim());
        JavaType type = parseType(c6478a);
        if (c6478a.hasMoreTokens()) {
            throw _problem(c6478a, "Unexpected tokens after complete type");
        }
        return type;
    }

    public List<JavaType> parseTypes(C6478a c6478a) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (c6478a.hasMoreTokens()) {
            arrayList.add(parseType(c6478a));
            if (!c6478a.hasMoreTokens()) {
                break;
            }
            String strNextToken = c6478a.nextToken();
            if (">".equals(strNextToken)) {
                return arrayList;
            }
            if (!",".equals(strNextToken)) {
                throw _problem(c6478a, "Unexpected token '" + strNextToken + "', expected ',' or '>')");
            }
        }
        throw _problem(c6478a, "Unexpected end-of-string");
    }

    public TypeParser withFactory(TypeFactory typeFactory) {
        return typeFactory == this._factory ? this : new TypeParser(typeFactory);
    }

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    public JavaType parseType(C6478a c6478a) throws IllegalArgumentException {
        if (c6478a.hasMoreTokens()) {
            Class<?> clsFindClass = findClass(c6478a.nextToken(), c6478a);
            if (c6478a.hasMoreTokens()) {
                String strNextToken = c6478a.nextToken();
                if ("<".equals(strNextToken)) {
                    return this._factory._fromClass(null, clsFindClass, TypeBindings.create(clsFindClass, parseTypes(c6478a)));
                }
                c6478a.m11858c(strNextToken);
            }
            return this._factory._fromClass(null, clsFindClass, TypeBindings.emptyBindings());
        }
        throw _problem(c6478a, "Unexpected end-of-string");
    }
}
