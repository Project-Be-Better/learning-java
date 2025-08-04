package com.basics;

import com.accessmodifiers.AccessModifier;

public class ExtendedAccessModifier extends AccessModifier {

    void walk(){
        this.protectedAccess();
    }
}
