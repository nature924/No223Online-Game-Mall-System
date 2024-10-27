package com.entity.chat;

import com.entity.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class ImData {
    private UserInfo mine;
    private List<Friend> friend;
    private List<Groups> group;

    public UserInfo getMine() {
        return mine;
    }

    public ImData setMine(UserInfo mine) {
        this.mine = mine;
        return this;
    }

    public List<Friend> getFriend() {
        return friend;
    }

    public ImData setFriend(List<Friend> friend) {
        this.friend = friend;
        return this;
    }

    public List<Groups> getGroup() {
        return group;
    }

    public ImData setGroup(List<Groups> group) {
        this.group = group;
        return this;
    }
}
