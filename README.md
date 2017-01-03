Tree
====

Author: Tomáš Adamják

Web: <http://thomas.adamjak.net>

License
-------

Copyright (c) 2016, Tomáš Adamják

All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.


Maven repository
----------------

```xml
<repositories>
    <repository>
        <releases>
            <enabled>true</enabled>
            <updatepolicy>always</updatepolicy>
            <checksumPolicy>fail</checksumPolicy>
        </releases>
        <id>Nexus</id>
        <name>tomas adamjak</name>
        <url>http://repo.adamjak.net/nexus/content/repositories/adamjak_net_releases/</url>
        <layout>default</layout>
    </repository>
</repositories>

<dependency>
    <groupid>net.adamjak.utils</groupid>
    <artifactid>Tree</artifactid>
    <version>0.9.4-RELEASE</version>
</dependency>
```
