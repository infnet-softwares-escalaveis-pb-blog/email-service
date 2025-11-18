# Ajustes no Docker Desktop
1. Abra Docker Desktop → Settings → Docker Engine.
2. Altere o JSON adicionando "dns": ["8.8.8.8", "8.8.4.4"], por exemplo:
```
{ 
    "builder":
        { "gc": { 
            "defaultKeepStorage": "20GB", 
            "enabled": true 
        } 
    },
     "experimental": false, 
     "dns": ["8.8.8.8", "8.8.4.4"] 
}
```