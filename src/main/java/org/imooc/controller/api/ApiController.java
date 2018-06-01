package org.imooc.controller.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.imooc.bean.AdVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * 为前端APP提供api接口，返回json格式数据
 * @author Administrator
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value="/homead", method= RequestMethod.GET)
    public List<AdVo> homead() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String s = "[{\"title\":\"暑假5123123折\",\"img\":\"http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191639092-2000037796.png\",\"link\":\"http://www.imooc.com/wap/index\"},{\"title\":\"特价出国\",\"img\":\"http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191648124-298129318.png\",\"link\":\"http://www.imooc.com/wap/index\"},{\"title\":\"亮亮车\",\"img\":\"http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191653983-1962772127.png\",\"link\":\"http://www.imooc.com/wap/index\"},{\"title\":\"学钢琴\",\"img\":\"http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191700420-1584459466.png\",\"link\":\"http://www.imooc.com/wap/index\"},{\"title\":\"电影\",\"img\":\"http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191706733-367929553.png\",\"link\":\"http://www.imooc.com/wap/index\"},{\"title\":\"旅游热线\",\"img\":\"http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191713186-495002222.png\",\"link\":\"http://www.imooc.com/wap/index\"}]";
        return mapper.readValue(s, new TypeReference<List<AdVo>>(){});
    }
}
