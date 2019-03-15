// const os = require('os');

// console.log('Architecture ' + os.arch());
// console.log('CPUs ' + os.cpus().length);
// console.log('OS ' + os.platform());

const fs = require('fs');
const fileName = __dirname + '/test.txt';
const outFileName = __dirname + '/test-copy.txt';

// fs.readFile(fileName, (err, data) => {
//     if(err) console.log(err);

//     console.log(data.toString());
// })

const readStream = fs.createReadStream(fileName);
const writeStream = fs.createWriteStream(outFileName);

readStream.pipe(writeStream);

readStream.on('data', data => {
    console.log(data.toString());
});