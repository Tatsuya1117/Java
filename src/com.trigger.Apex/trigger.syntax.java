trigger TriggerName on ObjectName (trigger_events) {
    code_block[ before insert, 
                before update, 
                before delete, 
                after insert, 
                after update, 
                after delete, 
                after undelete];
}

trigger HelloWorldTrigger on Account (before insert) {
    System.debug('Hello World!');
}

trigger HelloWorldTrigger on Account (before insert) {
    for(Account a : Trigger.New) {
        a.Description = 'New description';
    }
}

trigger ContextExampleTrigger on Account (before insert, after insert, after delete) {
    if(Trigger.isInsert) {
        if(Trigger.isBefore) {
            // Process before insert
        } else if(Trigger.isAfter) {
            // Process after insert
        }
    }
    else if (Trigger.isDelete) {
        // Process after delete
    }
}

//トリガからのクラスメソッドのコール
trigger ExampleTrigger on Contact (after insert, after delete) {
    if(Trigger.isInsert) {
        Integer recordCount = Trigger.New.size();
        // Call a utility method form another class
        EmailManager.sendMail('Your email address', 'Trailhead Trigger Tutorial', recordCount  + ' contact(s) were inserted.');
    }
    else if (Trigger.isDelete) {
        // Process after delete
    }
}

// 関連レコードの追加(次回ここから[ https://trailhead.salesforce.com/ja/content/learn/modules/apex_triggers/apex_triggers_intro?trail_id=force_com_dev_beginner#Tdxn4tBK-heading8 ])
