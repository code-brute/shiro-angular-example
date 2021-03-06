/*
 * Copyright 2016 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.tutorial.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;


@Path("/welcome")
public class WelcomeResource {

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public Welcome getMessageOfTheDay() {
        return new Welcome("The First Order welcomes you.");
    }

    @XmlRootElement
    public static class Welcome {
        public String messageOfTheDay;

        public Welcome(String messageOfTheDay) {
            this.messageOfTheDay = messageOfTheDay;
        }
    }
}
